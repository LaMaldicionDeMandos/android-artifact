package ${package};

import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.app.SherlockActivity;

public class MainActivity extends SherlockActivity {

    private static String TAG = "${artifactId}";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
	public boolean onCreateOptionsMenu(Menu menu){
		getSupportMenuInflater().inflate(R.menu.menu, menu);
		menu.findItem(R.id.default_activity).setVisible(false);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
		case R.id.master_detail:
			startActivity(new Intent(this, ItemListActivity.class));
		return true;
		case R.id.grid_activity:
			startActivity(new Intent(this, GridActivity.class));
		return true;
		case R.id.tab_activity:
			startActivity(new Intent(this, TabActivity.class));
		return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
