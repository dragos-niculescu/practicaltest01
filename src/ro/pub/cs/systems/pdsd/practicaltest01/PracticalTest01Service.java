package ro.pub.cs.systems.pdsd.practicaltest01;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class PracticalTest01Service extends Service {

	private int clicks = 0; 
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public void onCreate() {
		Toast.makeText(this, "Service Created", Toast.LENGTH_LONG ).show();

	}

	@Override
	public int onStartCommand (Intent intent, int a, int b) {
		Toast.makeText(this, "Service onStartCommand" , Toast.LENGTH_LONG).show();
		
		int query = intent.getIntExtra("querycounter", 0);
		if(query == -1)
			Toast.makeText(this, "Service queried =" + query, Toast.LENGTH_LONG).show();
		else{
			int left = intent.getIntExtra("leftcounter", 0);
			int right = intent.getIntExtra("rightcounter", 0);
			Toast.makeText(this, "Service set left =" + left + "rght = " + right, Toast.LENGTH_LONG).show();
		
		}
		 return START_STICKY;
	}

	@Override
	public void onDestroy() {
		Toast.makeText(this, "Service Destroyed " + clicks, Toast.LENGTH_LONG).show();

	}

}
