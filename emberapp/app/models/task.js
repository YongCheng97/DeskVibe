import Model from '@ember-data/model';

export default class TaskModel extends Model {

    @attr taskId;
    @attr taskName;
    @attr estimatedTime;
    @attr completionStatus;
}
