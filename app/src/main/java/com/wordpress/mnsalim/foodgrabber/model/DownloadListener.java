package com.wordpress.mnsalim.foodgrabber.model;

/**
 * An in
 * @author innovative
 *
 */
public interface DownloadListener
{
	/**
	 * Called when caller has finished doing the download task.
	 */
	public void onFinish();
	
	/**
	 * Called when JSON response found from with HTTP_STATUS = 404 or 400 
	 * @param json
	 */
	public void onError(String response);
	
	/**
	 * Called when an upgrade happened on download progress
	 * @param progress
	 */
	public void onProgress(double progress);
}
