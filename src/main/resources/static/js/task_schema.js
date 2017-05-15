angular.module('oracleform').value('Schema', [ 
{
	key : 'firstname',
	type : 'input',
	templateOptions : {
	    required: true,
		type : 'input',
		label : 'First name',
		placeholder : 'Enter first name'
	}
},{
	key : 'lastname',
	type : 'input',
	templateOptions : {
	    required: true,
		type : 'input',
		label : 'Last name',
		placeholder : 'Enter last name'
	}
},
{
	key : 'language',
	type : 'select',
	templateOptions : {
		options: [
		 {id:'en',name:'English'},
		 {id:'fr',name:'French'},
		 {id:'de',name:'German'},
		 {id:'nl',name:'Dutch'},
		 {id:'it',name:'Italian'},
		 {id:'es',name:'Spanish'}],
		required: true,
		type : 'language',
		label : 'Language',
		valueProp: 'id',
        labelProp: 'name',
		placeholder : 'Enter language',
	}
}, {
	key : 'email',
	type : 'input',
	templateOptions : {
		type : 'email',
		label : 'Email address',
		required: true,
		placeholder : 'Enter email'
	}
}, 
{
    "template": "<hr /><div><strong>If you attended the workshop:</strong></div><br>"
},
{
    key : 'opinionBefore',
    type : 'textarea',
    templateOptions : {
        type : 'input',
        label : 'What was your opinion on Oracle before the workshop?'
    }
},
{
    key : 'opinionNow',
    type : 'textarea',
    templateOptions : {
        type : 'input',
        label : 'What is your opinion now?'
    }
},
{
    key : 'opinionLike',
    type : 'textarea',
    templateOptions : {
        type : 'input',
        label : 'What did you like from the workshop?'
    }
},
{
    key : 'opinionImprove',
    type : 'textarea',
    templateOptions : {
        type : 'input',
        label : 'What can be improve in the workshop?'
    }
},
{
    "template": "<hr /><div><strong>Professional details:</strong></div>"
},
{
    "className": "row",
    "fieldGroup": [
		{
		"className": "col-xs-6",
		key : 'company',
		type : 'input',
		templateOptions : {
			type : 'input',
			label : 'Company',
			placeholder : 'Enter company'
		}
	},{
	"className": "col-xs-6",
	key : 'role',
	type : 'select',
	templateOptions : {
		options: [
		 {id:'ceo',name:'CEO'},
		 {id:'cto',name:'CTO'},
		 {id:'dev',name:'Developer'},
		 {id:'tes',name:'Tester'},
		 {id:'ana',name:'Analyst'}],
		type : 'role',
		label : 'Role',
		valueProp: 'id',
        labelProp: 'name',
		placeholder : 'Enter role',
	}
	}]
},
{
key : 'topic',
type : 'textarea',
templateOptions : {
	type : 'input',
	label : 'Project/Topics you want to discuss with us'
}
}
, {
	key : 'contact',
	type : 'checkbox',
	templateOptions : {
		label : 'I want to be contacted by Oracle'
	}
} ]);