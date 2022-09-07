# NetworkStatus
Check realtime internet network status



Permission 
------
```xml
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
```

Gradle 
------
```
dependencies {
    ...
    implementation 'com.github.paonesoni:NetworkInternetStatus:v1.0'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.5.1'

}
```

Project Gradle 
--------------
```
repositories {
    google()
    mavenCentral()
    maven { url "https://jitpack.io" }
}

```

Quickstart
----------
```kotlin
  private lateinit var networkStatusManager: NetworkStatusManager
```

Inside the onCreate
```kotlin
 override fun onCreate(savedInstanceState: Bundle?) {
 
 ...
 
      networkStatusManager = NetworkStatusManager(this)
        lifecycleScope.launch {
            networkStatusManager.checkInternet.collect{
                Log.e("NetworkStatus",">> $it")
            }
        }
 }
```


License 
--------

    Copyright 2022 paonesoni

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

