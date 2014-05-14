package org.jenkinsci.plugins.subversionMerge;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;

@Extension
public class Test implements UnprotectedRootAction {

//  get Icon
    public String getIconFileName(){
        return "/plugin/subversionMerge/images/icon.png";
    }
//  the Display name
    public String getDisplayName(){
        return "SVN Merge";
    }
//  Url
    public String getUrlName(){

        return "svnmerge";
    }

}