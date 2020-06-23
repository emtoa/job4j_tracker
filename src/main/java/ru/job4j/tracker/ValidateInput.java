package ru.job4j.tracker;

public class ValidateInput implements Input {
    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (IllegalStateException moe) {
                out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }

    public static void main(String[] args) {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"zero", "0"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");

        System.out.println(selected);
    }
}