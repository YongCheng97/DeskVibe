import Route from '@ember/routing/route';

export default class MemberDashboardIndexRoute extends Route {

    async model() {

        const response = await fetch('http://localhost:8081/findAllTeamMembers/5f9f06667e44eb76a5265a37');
        const data = await response.json();

        // console.log(data);
        console.log(data.tasks);
        return data.tasks;

    }
}
