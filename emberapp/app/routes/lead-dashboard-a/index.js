import Route from '@ember/routing/route';
import {inject as service} from '@ember/service';

export default class LeadDashboardAIndexRoute extends Route {
    @service store;

    async model() {

        const response = await fetch('http://localhost:8083/findAllProjects');
        const data = await response.json();

        console.log(data);
        return data;

    }
 
}
