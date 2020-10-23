import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | memberDashboard/index', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:member-dashboard/index');
    assert.ok(route);
  });
});
