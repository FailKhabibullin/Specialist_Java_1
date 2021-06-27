package org.fail.specialistjava1.homeworks.labs.lab3;

public class SimpleParser extends ComLineParserBase {
	private String inFile;
	private String outFile;


	public SimpleParser(String[] keys) {
		super(keys);
	}

	public SimpleParser(String[] keys, String[] delimeters) {
		super(keys, delimeters);
	}

	@Override
	protected SwitchStatus OnSwitch(String key, String keyValue) {
		SwitchStatus status = SwitchStatus.NoError;
		switch (key) {
			case "?":
				status = SwitchStatus.ShowUsage;
				break;
			case "r":
				if (keyValue.isEmpty() || keyValue == null) {
					System.out.println("Error");
					status = SwitchStatus.Error;
					break;
				}
				inFile = keyValue;
				break;
			case "w":
				if (keyValue.isEmpty() || keyValue == null) {
					System.out.println("Error");
					status = SwitchStatus.Error;
					break;
				}
				outFile = keyValue;
			default:
				throw new IllegalArgumentException("Invalid arg");
		}
		return status;
	}

	@Override
	protected void OnUsage(String errorKey) {
		if (errorKey != null)
			System.out.println("Command-line switch error:" + errorKey);

		System.out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
		System.out.println("   -? показать Help файл");
		System.out.println("   -r задать имя входного файла");
		System.out.println("   -w выполнить вывод в указанный файл");
	}
}
