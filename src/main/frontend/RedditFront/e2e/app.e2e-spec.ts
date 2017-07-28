import { RedditFrontPage } from './app.po';

describe('reddit-front App', function() {
  let page: RedditFrontPage;

  beforeEach(() => {
    page = new RedditFrontPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('rd works!');
  });
});
