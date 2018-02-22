import pages.AboutPage;
import pages.CommentPage;
import pages.ContactPage;
import pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
