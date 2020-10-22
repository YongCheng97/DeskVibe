import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | lead-dashboardC/index', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:lead-dashboard-c/index');
    assert.ok(route);
  });
});
