package vn.vinhdeptrai.employeemanagementsystem.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public enum ErrorCode {
    USER_NOT_EXISTED(1005, "User not existed", HttpStatus.NOT_FOUND);
    private int code;
    private  String message;
    private HttpStatus httpStatus;
    ErrorCode(int code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
