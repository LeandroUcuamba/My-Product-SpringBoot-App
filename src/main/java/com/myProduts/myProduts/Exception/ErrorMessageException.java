package com.myProduts.myProduts.Exception;

public class ErrorMessageException {
    private String errorMessage;

    public ErrorMessageException(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
