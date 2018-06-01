# Lock Screen

Simple and beautiful Lock Screen library to set an check pin code. Integrated with fingerprint authentication.

Easily secure your app with Lock Screen library as easy as starting an intent. 

With great animations for fingerprint authentication.

Set Pin:

![Screenshots](https://github.com/amirarcane/lock-screen/blob/master/demo/set.gif)

Check Pin:
 
![Screenshots](https://github.com/amirarcane/lock-screen/blob/master/demo/check.gif) 

Lock Screen gets a 4 digit pincode from user at first running time. After that every time that you start the intent, It asks  
for pincode.

Watching this repository will allow GitHub to email you whenever I publish a release.

---
# Gradle Dependency

Add this line to your `build.gradle` project

```java
compile 'com.amirarcane.lock-screen:lockscreen:2.0.0'
```
---
# Usage

 Just add  Lock Screen activity to your manifest:
 
 ```java
 <activity android:name="com.amirarcane.lockscreen.activity.EnterPinActivity"
           android:theme="@style/Theme.AppCompat.NoActionBar"/>
 ```
 
 Now easily start the Intent:
 
 ```java
  Intent intent = new Intent(getContext(), EnterPinActivity.class);
  startActivity(intent);
  ```
  
  That's it. As easy as piece of cake.
  
  At first run It checks if you entered pin before or not, If pin was set, It asks for Entering pin else It asks for 
  setting pincode. If you need to change pin or for any reason you want to set pin again just start the intent like below:
  
  ```java
    Intent intent = EnterPinActivity.getIntent(getContext(), SET_PIN);
    startActivity(intent);
   ```
    
SET_PIN is boolean.

If you need to handle back press of Lock Screen activity, just try onActivityResult:

  ```java
    @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            switch (requestCode) {
                case REQUEST_CODE:
                if (resultCode == EnterPinActivity.RESULT_BACK_PRESSED) {
                    Toast.makeText(MainActivity.this, "back pressed", Toast.LENGTH_LONG).show();
                }
                break;
            }
        }
   ```
   
See MainActivity class in Sample app for understanding how this library works. 

---
 # Customization

If you need to set font for this library try like below:

```java
  Intent intent = EnterPinActivity.getIntent(getContext(), FONT_TEXT, FONT_NUMBERS);
  startActivity(intent);
  ```
  
FONT_TEXT and FONT_NUMBERS are path of your fonts in assets folder like "font/Arial.ttf"

IF need set pin and changing fonts, do this:

```java
  Intent intent = EnterPinActivity.getIntent(getContext(), SET_PIN, FONT_TEXT, FONT_NUMBERS);
  startActivity(intent);
  ```
  
I customized PinLockView by andrognito for my Lock Screen view. In case of any further customization, fork the library
and change it.
