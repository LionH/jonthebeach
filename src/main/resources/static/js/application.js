var app = angular.module('application', ['ui.bootstrap', 'ui.router', 'ngMaterial','oracleform']);

app
		.config(function($logProvider, $stateProvider, $urlRouterProvider,
				$httpProvider) {
			$logProvider.debugEnabled(true);
			$urlRouterProvider.otherwise("/index.html");

			$stateProvider.state('home', {
				url : "/"
			});
			$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
		});

app.controller('home', function($http) {
	var self = this;
	$http.get('/resource/').then(function(response) {
		self.greeting = response.data;
	})
});

app.controller('initialization', function($scope, $log) {
	$log.debug('initialized');
	$scope.title = "JonTheBeach";
});