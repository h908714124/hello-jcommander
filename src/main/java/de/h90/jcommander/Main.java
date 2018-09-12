package de.h90.jcommander;

import com.beust.jcommander.JCommander;

public class Main {

    public static void main(String[] _ignore) {
        Args args = new Args();
        String[] argv = { "-log", "2", "-groups", "unit" };
        JCommander.newBuilder()
                .addObject(args)
                .build()
                .parse(argv);
        System.out.println(args.groups());
    }
}
