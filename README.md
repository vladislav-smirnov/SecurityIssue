# SecurityIssue

# Why this project exist? 
I have already reported this to Google, but they have said that it is not a security issue. However, I believe that it is still an issue that should be fixed.

* Even if Google does not consider a bug to be a security issue, it could still be a problem for users. It is important to report all bugs, so that they can be fixed and users can be protected.
* To inform other developers about a bug or feature that they may not be aware of.
* To raise awareness of a potential security issue.
* To share my knowledge and expertise with others.

## Description

The viewInflaterClass attribute is a part of the AppCompat library and
is used to specify the class that should be used to inflate views. This
attribute is public, which means that it can be overridden by malicious
developers. If a malicious developer overrides this attribute, they can
then access all views in the application and listen to passwords or
other sensitive data.

## About attribute

It is an attribute that can be used to specify the class that will be used to inflate views from layout files. The default value for this attribute is AppCompatViewInflater, which will inflate AppCompat versions of the standard Android widgets. However, you can also specify a custom view inflater class if you want to customize the way that views are inflated. To use viewInflaterClass, you need to add it to your application theme. The value of the attribute should be the fully-qualified class name of your custom view inflater class. Once you have added this attribute to your application theme, all views that are inflated from layout files will be inflated using your custom view inflater class. 

Here are some of the benefits of using viewInflaterClass:
* You can customize the way that views are inflated.
* You can use AppCompat versions of the standard Android widgets, even if you are targeting an older version of Android.
* You can fix bugs in the way that views are inflated.


## Example
Anyone can create an Android library. This library could do anything, but let's say it has some useful functionality for developers. A bad actor (hacker or scammer) could then add their own ViewInflater class to the library. When developers add this library to their project, they will not have control over the views and will not know that the bad actor has full access to them. This means that the bad actor could add an addTextChangedListener to an EditText, for example, and listen to all password changes.

## How to Reproduce

To reproduce this bug, follow these steps:

1.  Create a new Android project and lib module.

2.  Add the following attribute to your application theme:
    > \<item name="viewInflaterClass"\>com.example.MyCustomViewInflater\</item\>
3. In the AndroidManifest.xml file of lib, add the following attribute to the activity element:
    > android:theme="App.Theme" 
4. Include this lib module into the main project
5. Build and run the project.

## Impact

This bug allows malicious developers to access all views in an
application and listen to passwords or other sensitive data. This could
allow them to steal personal information, financial information, or
other sensitive data from users.

## Suggested Fixes

There are a few possible fixes for this bug:

1.  Make the viewInflaterClass attribute private so that it cannot be overridden by malicious developers.

2.  Add a check to the AppCompat library to ensure that the viewInflaterClass attribute is only set to a trusted class.

3.  Remove the viewInflaterClass attribute from the AppCompat library.

## Mitigation

There are a few things that developers can do to mitigate the risk of
this bug:

1.  Only add trusted libraries to their projects.

2.  Inspect the source code of any libraries that they add to their projects.

3.  Use a security scanner to scan their projects for security vulnerabilities.

## Conclusion

This bug is a serious security vulnerability that could allow malicious
developers to access all views in an application and listen to passwords
or other sensitive data. Developers should take steps to mitigate the
risk of this bug by only adding trusted libraries to their projects and
by inspecting the source code of any libraries that they add to their
projects.
