package org.jackhuang.hmcl.ui.main;

import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.jackhuang.hmcl.Metadata;
import org.jackhuang.hmcl.ui.construct.ComponentList;
import org.jackhuang.hmcl.ui.construct.IconedTwoLineListItem;
import org.jackhuang.hmcl.ui.construct.TwoLineListItem;

import static org.jackhuang.hmcl.util.i18n.I18n.i18n;

public class AboutPage extends StackPane {

    public AboutPage() {
        ComponentList about = new ComponentList();
        {
            IconedTwoLineListItem launcher = new IconedTwoLineListItem();
            launcher.setImage(new Image("/assets/img/craft_table.png", 32, 32, false, true));
            launcher.setTitle("Hello Minecraft! Launcher");
            launcher.setSubtitle(Metadata.VERSION);
            launcher.setExternalLink("https://hmcl.huangyuhui.net");

            IconedTwoLineListItem author = new IconedTwoLineListItem();
            author.setImage(new Image("/assets/img/yellow_fish.png", 32, 32, false, true));
            author.setTitle("huanghongxun");
            author.setSubtitle("https://www.huangyuhui.net");
            author.setExternalLink("https://www.huangyuhui.net");

            about.getContent().setAll(launcher, author);
        }

        ComponentList thanks = new ComponentList();
        {
            IconedTwoLineListItem yushijinhun = new IconedTwoLineListItem();
            yushijinhun.setTitle("yushijinhun");
            yushijinhun.setSubtitle(i18n("about.thanks_to.yushijinhun.statement"));
            yushijinhun.setExternalLink("https://yushi.moe/");

            IconedTwoLineListItem bangbang93 = new IconedTwoLineListItem();
            bangbang93.setTitle("bangbang93");
            bangbang93.setSubtitle(i18n("about.thanks_to.bangbang93.statement"));
            bangbang93.setExternalLink("https://bmclapi2.bangbang93.com/");

            IconedTwoLineListItem gamerteam = new IconedTwoLineListItem();
            gamerteam.setTitle("gamerteam");
            gamerteam.setSubtitle(i18n("about.thanks_to.gamerteam.statement"));
            gamerteam.setExternalLink("http://www.zhaisoul.com/");

            IconedTwoLineListItem contributors = new IconedTwoLineListItem();
            contributors.setTitle(i18n("about.thanks_to.contributors"));
            contributors.setSubtitle(i18n("about.thanks_to.contributors.statement"));
            contributors.setExternalLink("https://github.com/huanghongxun/HMCL/graphs/contributors");

            thanks.getContent().setAll(yushijinhun, bangbang93, gamerteam, contributors);
        }

        ComponentList dep = new ComponentList();
        {
            IconedTwoLineListItem jfoenix = new IconedTwoLineListItem();
            jfoenix.setTitle("JFoenix");
            jfoenix.setSubtitle("Copyright (c) 2016 JFoenix.\nLicensed under the MIT License.");
            jfoenix.setExternalLink("http://www.jfoenix.com/");

            IconedTwoLineListItem gson = new IconedTwoLineListItem();
            gson.setTitle("Gson");
            gson.setSubtitle("Copyright 2008 Google Inc.\nLicensed under the Apache 2.0 License.");
            gson.setExternalLink("https://github.com/google/gson");

            IconedTwoLineListItem xz = new IconedTwoLineListItem();
            xz.setTitle("XZ for Java");
            xz.setSubtitle("Lasse Collin, Igor Pavlov, and/or Brett Okken.\nPublic Domain.");
            xz.setExternalLink("https://tukaani.org/xz/java.html");

            IconedTwoLineListItem fxgson = new IconedTwoLineListItem();
            fxgson.setTitle("fx-gson");
            fxgson.setSubtitle("Copyright (c) 2016 Joffrey Bion.\nLicensed under the MIT License.");
            fxgson.setExternalLink("https://github.com/joffrey-bion/fx-gson");

            IconedTwoLineListItem constantPoolScanner = new IconedTwoLineListItem();
            constantPoolScanner.setTitle("Constant Pool Scanner");
            constantPoolScanner.setSubtitle("Copyright 1997-2010 Oracle and/or its affiliates.\nLicensed under the GPL 2 or the CDDL.");
            constantPoolScanner.setExternalLink("https://github.com/jenkinsci/constant-pool-scanner");

            IconedTwoLineListItem openNBT = new IconedTwoLineListItem();
            openNBT.setTitle("OpenNBT");
            openNBT.setSubtitle("Copyright (C) 2013-2021 Steveice10.\nLicensed under the MIT License.");
            openNBT.setExternalLink("https://github.com/Steveice10/OpenNBT");

            dep.getContent().setAll(jfoenix, gson, xz, fxgson, constantPoolScanner, openNBT);
        }

        ComponentList legal = new ComponentList();
        {
            TwoLineListItem copyright = new TwoLineListItem();
            copyright.setTitle(i18n("about.copyright"));
            copyright.setSubtitle(i18n("about.copyright.statement"));

            TwoLineListItem claim = new TwoLineListItem();
            claim.setTitle(i18n("about.claim"));
            claim.setSubtitle(i18n("about.claim.statement"));

            TwoLineListItem openSource = new TwoLineListItem();
            openSource.setTitle(i18n("about.open_source"));
            openSource.setSubtitle(i18n("about.open_source.statement"));

            legal.getContent().setAll(copyright, claim, openSource);
        }

        ComponentList donations = new ComponentList();
        {
            // TODO
        }

        VBox content = new VBox(16);
        content.setPadding(new Insets(10));
        content.getChildren().setAll(
                ComponentList.createComponentListTitle(i18n("about")),
                about,

                ComponentList.createComponentListTitle(i18n("about.thanks_to")),
                thanks,

                ComponentList.createComponentListTitle(i18n("about.dependency")),
                dep,

                ComponentList.createComponentListTitle(i18n("about.legal")),
                legal,

                ComponentList.createComponentListTitle(i18n("about.donations")),
                donations
        );


        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(content);
        scrollPane.setFitToWidth(true);
        getChildren().setAll(scrollPane);
    }
}