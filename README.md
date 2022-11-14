# poc-react-native-sdk-used-in-native-app

1. Open project with AndroidStudio & hit run button.

2. When click on START GREEN PANDA button, React Native app activity will start.  

3. App will use callbacks set for onSuccess and onError, exposed by GreenPanda module from lib.  

4. To see effects, open Logcat & serach by tag: FromMain.

Cheers! 🍺


# Dev mentions

I used **react-native:0.64.2** from [this remote repo](https://central.sonatype.dev/artifact/com.beatjs.android/react-native/0.64.2.0).

In (app level) build.gradle added this line below:

`
    implementation 'com.beatjs.android:react-native:0.64.2.0'
`

And for custom react-native SDK:

`
    implementation files("libs/app-release.aar")
`
