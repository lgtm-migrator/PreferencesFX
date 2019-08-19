module com.dlsc.preferencesfx {

    requires transitive javafx.controls;
    requires transitive com.dlsc.formsfx;

    requires de.jensd.fx.fontawesomefx.fontawesome;
    requires de.jensd.fx.fontawesomefx.commons;

    requires java.prefs;
    requires gson;
    requires java.sql;
    requires org.controlsfx.controls;
    requires slf4j.api;

    exports com.dlsc.preferencesfx;
    exports com.dlsc.preferencesfx.formsfx.view.controls;
    exports com.dlsc.preferencesfx.formsfx.view.renderer;
    exports com.dlsc.preferencesfx.history;
    exports com.dlsc.preferencesfx.history.view;
    exports com.dlsc.preferencesfx.model;
    exports com.dlsc.preferencesfx.util;
    exports com.dlsc.preferencesfx.view;
}
