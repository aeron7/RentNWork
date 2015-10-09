import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Bapi on 08-10-2015.
 */
public class ApprentNwork extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading (WebView view, String url){
        if(Uri.parse(url).getHost().endsWith("rentnwork.com")){
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
