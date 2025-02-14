package com.weekly.sports.common.meta;

public enum ResultCode {
    SUCCESS(0, "정상 처리 되었습니다"),
    SYSTEM_ERROR(1000, "알 수 없는 애러가 발생했습니다."),
    NOT_EXIST_USER(2000, "존재하지 않는 유저입니다."),
    ALREADY_FOLLOWED(3000, "이미 팔로우된 유저입니다."),
    NOT_YET_FOLLOWED(3001, "아직 팔로우되지 않은 유저입니다.");

    private Integer code;
    private String message;

    ResultCode(Integer code, String errorMessage) {
        this.code = code;
        this.message = errorMessage;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
