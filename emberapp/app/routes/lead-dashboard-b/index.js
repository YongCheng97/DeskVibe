import Route from '@ember/routing/route';

export default class LeadDashboardBIndexRoute extends Route {

    async model() {

        const response = await fetch('http://localhost:8083/findAllProjects');
        const data = await response.json();

        console.log(data);
        return data;

    }
}
