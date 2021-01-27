package statemachine.typewriter;

public enum TypeWriterState {

    LOWER_CASE {
        @Override
        TypeWriterState next() {
            return TypeWriterState.UPPER_CASE;
        }
    },
    UPPER_CASE {
        @Override
        TypeWriterState next() {
            return TypeWriterState.LOWER_CASE;
        }
    };

    abstract TypeWriterState next();
}
