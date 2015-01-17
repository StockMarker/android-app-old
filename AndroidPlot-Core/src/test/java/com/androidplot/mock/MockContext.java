/*
 * Copyright 2012 AndroidPlot.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.androidplot.mock;

import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mockit.Mock;
import mockit.MockClass;

import java.io.*;

@MockClass(realClass = Context.class)
public class MockContext {

    /**
     * Useful for when methods are going to actually be called on a Context instance.
     * See {@link com.androidplot.PlotTest#testConfigure()} for an example.
     */
    public static final class MockContext2 extends Context {

        public MockContext2() {}

        @Override
        public AssetManager getAssets() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Mock
        public android.content.res.Resources getResources() { throw new IllegalArgumentException();}

        @Override
        public PackageManager getPackageManager() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ContentResolver getContentResolver() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Looper getMainLooper() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Context getApplicationContext() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setTheme(int i) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Resources.Theme getTheme() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ClassLoader getClassLoader() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public String getPackageName() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ApplicationInfo getApplicationInfo() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public String getPackageResourcePath() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public String getPackageCodePath() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public SharedPreferences getSharedPreferences(String s, int i) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public FileInputStream openFileInput(String s) throws FileNotFoundException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public FileOutputStream openFileOutput(String s, int i) throws FileNotFoundException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean deleteFile(String s) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public File getFileStreamPath(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public File getFilesDir() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public File getExternalFilesDir(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public File getObbDir() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public File getCacheDir() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public File getExternalCacheDir() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public String[] fileList() {
            return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public File getDir(String s, int i) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public SQLiteDatabase openOrCreateDatabase(String s, int i, SQLiteDatabase.CursorFactory cursorFactory) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public SQLiteDatabase openOrCreateDatabase(String s, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean deleteDatabase(String s) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public File getDatabasePath(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public String[] databaseList() {
            return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Drawable getWallpaper() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Drawable peekWallpaper() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int getWallpaperDesiredMinimumWidth() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int getWallpaperDesiredMinimumHeight() {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setWallpaper(Bitmap bitmap) throws IOException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void setWallpaper(InputStream inputStream) throws IOException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void clearWallpaper() throws IOException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void startActivity(Intent intent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        //@Override
        public void startActivity(Intent intent, Bundle bundle) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void startActivities(Intent[] intents) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        //@Override
        public void startActivities(Intent[] intents, Bundle bundle) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i1, int i2) throws IntentSender.SendIntentException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        //@Override
        public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i1, int i2, Bundle bundle) throws IntentSender.SendIntentException {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBroadcast(Intent intent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendBroadcast(Intent intent, String s) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendOrderedBroadcast(Intent intent, String s) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendOrderedBroadcast(Intent intent, String s, BroadcastReceiver broadcastReceiver, Handler handler, int i, String s1, Bundle bundle) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendStickyBroadcast(Intent intent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String s, Bundle bundle) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void removeStickyBroadcast(Intent intent) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String s, Handler handler) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ComponentName startService(Intent intent) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean stopService(Intent intent) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void unbindService(ServiceConnection serviceConnection) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public boolean startInstrumentation(ComponentName componentName, String s, Bundle bundle) {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Object getSystemService(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int checkPermission(String s, int i, int i1) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int checkCallingPermission(String s) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int checkCallingOrSelfPermission(String s) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void enforcePermission(String s, int i, int i1, String s1) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void enforceCallingPermission(String s, String s1) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void enforceCallingOrSelfPermission(String s, String s1) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void grantUriPermission(String s, Uri uri, int i) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void revokeUriPermission(Uri uri, int i) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int checkUriPermission(Uri uri, int i, int i1, int i2) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int checkCallingUriPermission(Uri uri, int i) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int checkCallingOrSelfUriPermission(Uri uri, int i) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public int checkUriPermission(Uri uri, String s, String s1, int i, int i1, int i2) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void enforceUriPermission(Uri uri, int i, int i1, int i2, String s) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void enforceCallingUriPermission(Uri uri, int i, String s) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void enforceCallingOrSelfUriPermission(Uri uri, int i, String s) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void enforceUriPermission(Uri uri, String s, String s1, int i, int i1, int i2, String s2) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Context createPackageContext(String s, int i) throws PackageManager.NameNotFoundException {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
