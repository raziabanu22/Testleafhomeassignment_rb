package week2.day1;

public class Browser {
	public void launchBrowser(String BrowserName) {

		System.out.println(BrowserName);
	}

	public void loadUrl() {
		System.out.println("URL loaded successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser launchNew = new Browser();
		launchNew.launchBrowser("chrome");
		launchNew.loadUrl();
	}
}
