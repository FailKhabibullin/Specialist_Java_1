package org.fail.specialistjava1.homeworks.labs.lab2.exercise1;

class ComLineParser {
  String[] keys;
  String[] delimiters;

  public ComLineParser(String[] keys) {
    this(keys, new String[] {"/", "-"});
  }

  public ComLineParser(String[] keys, String[] delimiters) {
    this.keys = keys;
    this.delimiters = delimiters;
  }

  public void onUsage(String errorKey) {
    if (errorKey != null) {
      System.out.println(
          "Command Line Format: nameProgram [-r<input-fileName>] [-w<output-fileName]");
    }
    System.out.println(" -? show Help file");
    System.out.println(" -r set input file name");
    System.out.println(" -w execute output to the specified file");
  }

  public SwitchStatus onSwitch(String key, String value) {
    System.out.println("Key: " + key + " Value: " + value);
    return SwitchStatus.NoError;
  }

  public boolean parse(String[] args) {
    SwitchStatus switchStatus = SwitchStatus.NoError;

    int argNum;
    for (argNum = 0; ((switchStatus == SwitchStatus.NoError) && argNum < args.length); argNum++) {

      boolean isDelimiter = false;
      for (int i = 0; (!isDelimiter && (i < delimiters.length)); i++) {
        isDelimiter = args[argNum].regionMatches(0, delimiters[i], 0, 1);
      }
      if (isDelimiter) {

        boolean isKey = false;

        int j;
        for (j = 0; !isKey && (j < keys.length); j++) {
          isKey =
              args[argNum]
                  .toUpperCase()
                  .regionMatches(1, keys[j].toUpperCase(), 0, keys[j].length());

          if (isKey) {
            break;
          }

          if (!isKey) {
            switchStatus = SwitchStatus.Error;
            break;

          } else {
            switchStatus = onSwitch(keys[j].toLowerCase(), args[argNum].substring(1 + keys.length));
          }
        }
      } else {
        switchStatus = SwitchStatus.Error;
        break;
      }

      if (switchStatus == SwitchStatus.ShowUsage) {
        onUsage(null);
      }
      if (switchStatus == SwitchStatus.Error) {
        onUsage((argNum == args.length) ? null : args[argNum]);
      }
    }
    return switchStatus == SwitchStatus.NoError;
  }
}
