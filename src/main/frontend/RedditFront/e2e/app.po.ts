import { browser, element, by } from 'protractor';

export class RedditFrontPage {
  navigateTo() {
    return browser.get('/');
  }

  getParagraphText() {
    return element(by.css('rd-root h1')).getText();
  }
}
