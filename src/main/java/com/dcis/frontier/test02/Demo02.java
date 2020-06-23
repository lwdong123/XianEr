package com.dcis.frontier.test02;

public class Demo02 {
    private String SdkAppId;
    public static void main(String[] args) {
        Demo02 submitModel = new Demo02();
        Demo02 taskDataSubmitRecord = new Demo02();
//        Optional.ofNullable(submitModel.getSdkAppId()).ifPresent(taskDataSubmitRecord::setSdkAppId);
        System.out.println(submitModel.getSdkAppId());
    }

    public String getSdkAppId() {
        return SdkAppId;
    }

    public void setSdkAppId(String sdkAppId) {
        SdkAppId = sdkAppId;
    }
}
