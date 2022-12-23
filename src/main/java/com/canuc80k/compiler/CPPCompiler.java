package com.canuc80k.compiler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.canuc80k.exception.CompileErrorException;

public class CPPCompiler extends Compiler {
    public CPPCompiler() {
        super();    
        List<String> initCommands = new ArrayList<String>();
        initCommands.add("cmd.exe");
        initCommands.add("/c");
        setCommands(initCommands);
    }

    public synchronized void compile_gplusplus(File sourceFile, File outputFile) throws IOException, InterruptedException, CompileErrorException {
        String compileCommand = "g++ \"" + sourceFile.getAbsolutePath() + "\" -o " + "\"" + outputFile.getAbsolutePath() + "\"";
        executeCommand(compileCommand);
    }

    public synchronized void run(File runFile) throws IOException, InterruptedException, CompileErrorException {
        String runCommand = runFile.getAbsolutePath();
        executeCommand(runCommand);
    }

    public synchronized void run(File runFile, String arg) throws IOException, InterruptedException, CompileErrorException {
        String runCommand = "c: && \"" + runFile.getAbsolutePath() + "\" \"" + arg + "\"";
        executeCommand(runCommand);
    }

    public synchronized void run(File runFile, String arg1, String arg2) throws IOException, InterruptedException, CompileErrorException {
        String runCommand = "c: && \"" + runFile.getAbsolutePath() + "\" \"" + arg1 + "\" \"" + arg2 + "\"";
        executeCommand(runCommand);
    }
}
