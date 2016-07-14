'use strict';

// tag::vars[]
const React = require('react');
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {students: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/students'}).done(response => {
			this.setState({students: response.entity._embedded.students});
		});
	}

	render() {
		return (
			<StudentList students={this.state.students}/>
		)
	}
}
// end::app[]

// tag::student-list[]
class StudentList extends React.Component{
	render() {
		var students = this.props.students.map(student =>
			<Student key={student._links.self.href} student={student}/>
		);
		return (
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Description</th>
				</tr>
				{students}
			</table>
		)
	}
}
// end::student-list[]

// tag::student[]
class Student extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.student.firstName}</td>
				<td>{this.props.student.lastName}</td>
				<td>{this.props.student.description}</td>
			</tr>
		)
	}
}
// end::student[]

// tag::render[]
React.render(
	<App />,
	document.getElementById('react')
)
// end::render[]