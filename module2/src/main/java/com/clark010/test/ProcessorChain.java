package com.clark010.test;

import java.util.ArrayList;
import java.util.List;

public class ProcessorChain {
    List<AProcessor> processors = new ArrayList<>();

    public void init() {
        for (AProcessor processor : processors) {
            if (!processor.init()) {
                //log.error("init processor failed:" + processor.name());
            } else {
                //log.info("init processor success:" + processor.name());
            }
        }
    }

    public void process(Doc doc) {
        for (AProcessor processor : processors) {
            Status status = processor.process(doc);
            // process the return status
            if (status == Status.SUCCESS) {
                // do some thing for failed process
                break;
            }
        }
    }

    public void cleanup() {
        for (AProcessor processor : processors) {
            if (!processor.cleanup()) {
                //log.error("cleanup processor failed:" + processor.name());
            } else {
                //log.info("cleanup processor success:" + processor.name());
            }
        }
    }
}
