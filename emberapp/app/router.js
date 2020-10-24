import EmberRouter from '@ember/routing/router';
import config from 'desk-vibe/config/environment';

export default class Router extends EmberRouter {
  location = config.locationType;
  rootURL = config.rootURL;
}

Router.map(function() {
  this.route('memberDashboard', function() {});
  this.route('not-found', {path: '/*path'});
  this.route('lead-dashboardA', function() {});
  this.route('lead-dashboardB', function() {});
  this.route('lead-dashboardC', function() {
    this.route('surveys');
    this.route('showFeedback', { path: '/*path' });
    this.route('showSurvey', { path: '/*path' });
  });
});
