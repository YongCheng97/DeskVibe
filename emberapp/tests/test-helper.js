import Application from 'desk-vibe/app';
import config from 'desk-vibe/config/environment';
import { setApplication } from '@ember/test-helpers';
import { start } from 'ember-qunit';

setApplication(Application.create(config.APP));

start();
