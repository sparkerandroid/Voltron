package com.voltron.router.compiler;


public interface Constants {
    String KEY_MODULE_NAME = "VOLTRON_ROUTER_MODULE_NAME";

    String MODULE_NAME_NOT_CONFIGED_ERR_MSG = "MODULE NAME NOT CONFIGURED or ILLEGAL! Please re-check it in your build.gradle";

    String LOG_PREFIX = "Voltron-Router-Compiler >>> ";

    String GENERATED_PACKAGE = "com.voltron.router.routes";

    String GENERATED_FILE_JAVA_DOC = "DO NOT EDIT! GENERATED BY VOLTRON!";

    interface TypeName {
        String ACTIVITY = "android.app.Activity";
        String FRAGMENT = "android.app.Fragment";
        String FRAGMENT_V4 = "android.support.v4.app.Fragment";
        String SERVICE = "android.app.Service";
        String PARCELABLE = "android.os.Parcelable";
    }

    // Java type
     String LANG = "java.lang";
     String BYTE = LANG + ".Byte";
     String SHORT = LANG + ".Short";
     String INTEGER = LANG + ".Integer";
     String LONG = LANG + ".Long";
     String FLOAT = LANG + ".Float";
     String DOUBEL = LANG + ".Double";
     String BOOLEAN = LANG + ".Boolean";
     String CHAR = LANG + ".Character";
     String STRING = LANG + ".String";
     String SERIALIZABLE = "java.io.Serializable";
     String PARCELABLE = "android.os.Parcelable";

    // methodName
    String METHOD_INJECT = "inject" ;
    String NAME_OF_AUTOWIRED = "__Autowired" ;
}
