import Model from '@ember-data/model';

export default class ProjectModel extends Model {

    @attr projectId;
    @attr projectName;
    @attr projectTasks;
    

}
