# NumberPickerPreference
This repository is about a number picker dialog in a PreferenceActivity.
As you have e.g. EditTextPreference or CheckboxPreference i needed a simple dialog with a number picker which is configurable via xml and updates his summary automatically.
You find the **screenshots** below.
#Usage
If you use a PreferenceFragment:

```java
    public static class PrefsFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.preferences);
        }
    }
```
example of a preferences.xml:

```xml
<?xml version="1.0" encoding="utf-8"?>
<PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <PreferenceCategory android:title="General">
        <de.leonardarnold.numberpickerpreference.NumberPickerPreference
            android:defaultValue="18"
            android:key="number_picker"
            app:MaxValue="15"
            app:MinValue="1"
            android:summary="number picked: %s"
            android:title="Give me a number" />
    </PreferenceCategory>
</PreferenceScreen>
```
The max. or min. value will be defined like:
```xml
app:MaxValue="15"
app:MinValue="1"
```
The **%s** in the summary will be replaced with the actual value of the picker.
```xml
android:summary="number picked: %s"
```
If the default value is out of the min-max range you get a warning via logcat.


![NumberPickerPreference screenshot number picker preference preferences](https://github.com/leonardarnold/NumberPickerPreference/blob/master/extras/picker_screenshot.png? "NumberPickerPreference screenshot")
![NumberPickerPreference screenshot number picker preference preferences](https://github.com/leonardarnold/NumberPickerPreference/blob/master/extras/preferences_screenshot.png? "NumberPickerPreferences screenshot")
