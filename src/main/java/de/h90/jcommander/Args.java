package de.h90.jcommander;

import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

class Args {

    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
    private Integer verbose = 1;

    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
    private String groups;

    @Parameter(names = "-debug", description = "Debug mode")
    private boolean debug = false;

    List<String> parameters() {
        return parameters;
    }

    Integer verbose() {
        return verbose;
    }

    String groups() {
        return groups;
    }

    boolean debug() {
        return debug;
    }
}