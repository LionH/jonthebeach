var task = angular.module('oracleform', ['formly','formlyBootstrap'])
	.controller('TasksController', ['Schema', 'Data', 'addUser', function(Schema, data, addUser) {
		var tc = this;
	    tc.taskSchema = Schema;
	    tc.taskData=data;
	    tc.submit = function () {
	    	if (!(data.lastname&&data.firstname&&data.language&&data.email)) {
				window.alert('Some missing inputs, please verify that all fields are not empty');
				return;
			}
	    	console.log(this.taskData);
	    	addUser.submit(this.taskData);
	    };
	 }
	]);

angular.module('oracleform').factory('addUser', function($http){
	return {
		submit: function(taskData){
		var req = {
	        method: 'POST',
	        url: 'addUser',
	        headers: { "Content-Type": "application/json" },
	        data: JSON.stringify(taskData),
	      };
	
	      $http(req).then(
	        function(response) {
	          $('.form').toggleClass('form-submit');
	          $('#confirm-submit').modal();
	        },
	        function(response){
	          window.alert('fail')
	        }
	       );
		}
	}
});