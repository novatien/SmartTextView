# SmartTextView
## Gradle
```gradle
allprojects{
	repositories{
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies{
    ...
    implementation 'com.github.novatien:SmartTextView:1.0.1'
}
 ```
## Use
```xml
<com.notin.text.SmartTextView
        android:id="@+id/txt_smart"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:textSize="14sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" >
```
