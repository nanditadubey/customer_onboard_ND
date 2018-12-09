package io.apitest.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by prasantabiswas on 30/06/18.
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WorkflowNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public WorkflowNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public WorkflowNotFoundException() {
        super();
    }
}
