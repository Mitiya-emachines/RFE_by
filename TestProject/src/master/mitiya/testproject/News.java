package master.mitiya.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class News extends ActionBarActivity implements OnClickListener {

	final int REQUEST_CODE = 1;
	TextView allNews;
	Button addNews;
	private WebView mWebView;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news);
		
		addNews = (Button) findViewById(R.id.addNews);
		addNews.setOnClickListener(this);
		
		mWebView.setWebViewClient(new HelloWebViewClient());	//includes support opening web page to in this application a not in browser
		mWebView = (WebView) findViewById(R.id.webView_news);
		// includes support JavaScript
	    mWebView.getSettings().setJavaScriptEnabled(true);
		// specify the download page
	    //mWebView.loadUrl("http://www.rfe.by/j-mobile/abiturientu/spiski-abiturientov2015"); 
	    mWebView.loadUrl("http://onliner.by"); 

	}
	
	private class HelloWebViewClient extends WebViewClient 
	{
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) 
	    {
	        view.loadUrl(url);
	        return true;
	    }
	}
	
	//return the previous page
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
			mWebView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intentAddNews = new Intent(this, AddNews.class);
		startActivityForResult(intentAddNews, REQUEST_CODE);
	}

	public void onActivityResult(int requestCode, int resultCode, Intent data){
		if (data==null) {return;}
		
		String news;
		String buffer = "";
		if (resultCode == RESULT_OK){
			news = data.getStringExtra("news");
			allNews.setText(news+buffer);
			buffer = news;
		}
		else { Toast.makeText(this, "Wrong result",Toast.LENGTH_SHORT).show(); }
	}
}
