package fscoward.spherepuyopuyo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import fscoward.view.spherepuyopuyo.SphereGLSurfaceView;

public class MainActivity extends Activity {
	
	private SphereGLSurfaceView sglsv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		sglsv = new SphereGLSurfaceView(this);
		setContentView(sglsv);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
