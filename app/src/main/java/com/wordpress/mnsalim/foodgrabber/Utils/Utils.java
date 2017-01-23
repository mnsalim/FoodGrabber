package com.wordpress.mnsalim.foodgrabber.Utils;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.view.Gravity;
import android.widget.Toast;

@SuppressLint("DefaultLocale")
public class Utils 
{
	public static final boolean isTest = false;
	
	/**
	 * Check is user has any active network
	 * @param context an active context or acitivity
	 * @return a boolean indicating is user has any active network
	 */
	public static boolean hasActiveNetwork(Context context) 
	{
		ConnectivityManager connectivity = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		
		if (connectivity == null) 
		{
			return false;
		} 
		else
		{
			NetworkInfo[] info = connectivity.getAllNetworkInfo();
			if (info != null)
			{
				for (int i = 0; i < info.length; i++) 
				{
					if (info[i].getState() == NetworkInfo.State.CONNECTED)
					{
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Show a toast message
	 * @param mContext an active context or acitivity
	 * @param msg message to be displayed
	 */
	public static void showToast(Context mContext, String msg) 
	{
		Toast tost = Toast.makeText(mContext, msg, Toast.LENGTH_LONG);
		tost.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		tost.show();
	}

	/**
	 * Show a alert dialogue
	 * @param context an active context or acitivity
	 * @param title a string showed as the title of the dialogue
	 * @param message message to be displayed
	 */
	public static void showAlertDialog(Context context, String title,
			String message)
	{
		AlertDialog.Builder dg = new AlertDialog.Builder(context);
		dg.setTitle(title);
		dg.setMessage(message);
		dg.setCancelable(false);
		dg.setNeutralButton(context.getString(android.R.string.ok),
				new DialogInterface.OnClickListener() 
		{
					@Override
					public void onClick(DialogInterface dialog, int which)
					{
						dialog.cancel();
					}
				});
		dg.show();
	}

	/**
	 * Log the msg in logcat
	 * @param string message to log
	 */
	public static void Log(String string) {
		android.util.Log.d("Optical Glass Db................>>>>>>>", string);
	}

	public final static boolean isValidEmail(String mail)
	{
		CharSequence target = mail;
		if (target == null) {
			return false;
		} 
		else 
		{
			return android.util.Patterns.EMAIL_ADDRESS.matcher(target)
					.matches();
		}
	}


	/**
	 * Copy input stram into a output stream
	 * @param is inputStream from where data copied
	 * @param os outputstream where data pasted.
	 */
	public static void CopyStream(InputStream is, OutputStream os)
	{
		final int buffer_size = 1024;
		try {
			byte[] bytes = new byte[buffer_size];
			for (;;) {
				int count = is.read(bytes, 0, buffer_size);
				if (count == -1)
					break;
				os.write(bytes, 0, count);
			}
		} catch (Exception ex) {
		}
	}
	
	/**
	 * Checks if external storage is available for read and write
	 * @return a boolean 
	 */
	public static boolean isExternalStorageWritable() 
	{
	    String state = Environment.getExternalStorageState();
	    if (Environment.MEDIA_MOUNTED.equals(state))
	    {
	        return true;
	    }
	    return false;
	}

	/**
	 *  Checks if external storage is available to at least read
	 * @return a boolean
	 */
	public static boolean isExternalStorageReadable() 
	{
	    String state = Environment.getExternalStorageState();
	    if (Environment.MEDIA_MOUNTED.equals(state) ||
	        Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) 
	    {
	        return true;
	    }
	    return false;
	}
	
	/**
	 * get file directory to store data
	 * @param con
	 * @return
	 */
	public static String getFileDirectory(Context con)
	{
		String dir = null;
		
		if(Utils.isExternalStorageWritable())
		{
			dir = con.getExternalFilesDir(null).getPath()
				+ "/Optical Glass DB"
				+ "/";
		}
		
		return dir;
	}
	
	public static String getPdfPath(Context con, String glassType)
	{
		return getFileDirectory(con)+ Constants.GLASS_PDF_DIRECTORY + "/Glass_PDF/" + glassTypeToPdfName(glassType);
	}
	
	/**
	 * Convert glass type into correspondin pdf file name
	 * @param glassType a glasstype
	 * @return a string pdf file name
	 */
	public static String glassTypeToPdfName(String glassType)
	{
		String pdfName = "";
		
		glassType = glassType.replaceAll("-", "");
		glassType = glassType.replaceAll("\\s+", "0");
		glassType = glassType.toLowerCase();
		pdfName += "j"+glassType+".pdf";
		
		
		return pdfName;
	}
	
	public static void openPdf(Context con, String pdfFilePath)
	{
		File file = new File(pdfFilePath);

        if (file.exists())
        {
            /*Uri path = Uri.fromFile(file);
            //Intent intent = new Intent(Intent.ACTION_VIEW);
            //intent.setDataAndType(path, "application/pdf");
            //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

    	 	//Uri uri = Uri.parse(pdfPath);
    		Intent intent = new Intent(con,MyMuPDFActivity.class);
    		intent.setAction(Intent.ACTION_VIEW);
    		intent.setData(path);
    		//intent.putExtra(Magazine.FIELD_TITLE, "pdf tile");
    		//intent.putExtra(MyMuPDFActivity.SHOW_THUMBNAILS_EXTRA, true);
    		
    		
            try 
            {
                con.startActivity(intent);
            } 
            catch (ActivityNotFoundException e)
            {
                showToast(con, "No Application Available to View PDF");
            }*/
        }
    }
	
	/*private void openPdfFile(){
		String pdfPath = Environment.getExternalStorageDirectory()+"/qpdf.pdf";
        
	 	Uri uri = Uri.parse(pdfPath);
		Intent intent = new Intent(AppPDFReaderActivity.this,MyMuPDFActivity.class);
		intent.setAction(Intent.ACTION_VIEW);
		intent.setData(uri);
		intent.putExtra(Magazine.FIELD_TITLE, "pdf tile");
		intent.putExtra(MyMuPDFActivity.SHOW_THUMBNAILS_EXTRA, true);
		startActivity(intent);
	}*/
	
	/**
	 * Format Data search condition results decimal value to specific key requirments.
	 * @param condKey keys result to format
	 * @param value decimal point after dot.
	 * @return fomatted value as string.
	 */
	public static String getFormattedValue(String condKey, double value)
	{
		String returnValue = "";
		if(condKey.equalsIgnoreCase("nd"))
		{
			returnValue = String.format("%.5f", value);
		}
		else if(condKey.equalsIgnoreCase("ne"))
		{
			returnValue = String.format("%.5f", value);
		}
		else if(condKey.equalsIgnoreCase("vd"))
		{
			returnValue = String.format("%.1f", value);
		}
		else if(condKey.equalsIgnoreCase("ve"))
		{
			returnValue = String.format("%.1f", value);
		}
		else if(condKey.equalsIgnoreCase("nF-nC"))
		{
			returnValue = String.format("%f", value);
		}
		else if(condKey.equalsIgnoreCase("nF'-nC'"))
		{
			returnValue = String.format("%f", value);
		}
		else if(condKey.equalsIgnoreCase("θg,F"))
		{
			returnValue = String.format("%.4f", value);
		}
		else if(condKey.equalsIgnoreCase("Δθg,F"))
		{
			returnValue = String.format("%.4f", value);
		}
		else if(condKey.equalsIgnoreCase("λ80"))
		{
			returnValue = String.format("%d", (int)value);
		}
        else if(condKey.equalsIgnoreCase("(λ70)"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("λ5"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("dn/dt(D線,40～60℃)"))
        {
        	returnValue = String.format("%.1f", value);
        }
        else if(condKey.equalsIgnoreCase("Tg"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("At"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("α(-30~+70°C)"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("α(100~300°C)"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("ヌープ硬さHk"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("摩耗度Aa"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("RW(P)"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("RA(P)"))
        {
        	returnValue = String.format("%d", (int)value);
        }
        else if(condKey.equalsIgnoreCase("SR"))
        {
        	returnValue = String.format("%.1f", value);
        }
        else if(condKey.equalsIgnoreCase("PR"))
        {
        	returnValue = String.format("%.1f", value);
        }
        else if(condKey.equalsIgnoreCase("比重"))
        {
        	returnValue = String.format("%.2f", value);
        }
		
		return returnValue;
	}
}
