# GreatDayTo-Do-List

RoomDataPersistance
  topicsCovered:
    <br/>- Room
    <br/>- ModelView
    <br/>- Excecutor
    <br/>- LiveData
    
# Dependencies
make sure you have the below dependencies in build.gradle.app file
<br/> implementation fileTree(dir: 'libs', include: ['*.jar'])
<br/> implementation 'com.android.support:appcompat-v7:29.0.0'
<br/> 
<br/>   //  RecyclerView dependency; must match SDK version
<br/> implementation 'com.android.support:recyclerview-v7:29.0.0'


<br/>
<br/>// Room dependencies
<br/> implementation "android.arch.persistence.room:runtime:1.1.1"
<br/> implementation 'androidx.recyclerview:recyclerview:1.1.0'
<br/> implementation 'com.google.android.material:material:1.1.0'
<br/> annotationProcessor "android.arch.persistence.room:compiler:1.1.1"
<br/>
<br/> //liveData
<br/> implementation "android.arch.lifecycle:extensions:1.1.1"
<br/> annotationProcessor "android.arch.lifecycle:compiler:1.1.1"
<br/>
<br/> // Testing
<br/> // Instrumentation dependencies use androidTestImplementation
<br/> // (as opposed to testImplementation for local unit tests run in the JVM)
<br/> androidTestImplementation 'junit:junit:4.12'
<br/>androidTestImplementation 'com.android.support:support-annotations:28.0.0'
<br/>androidTestImplementation 'com.android.support.test:runner:1.0.2'
<br/>androidTestImplementation 'com.android.support.test:rules:1.0.2'
