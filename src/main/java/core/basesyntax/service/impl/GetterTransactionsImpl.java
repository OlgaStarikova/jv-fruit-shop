package core.basesyntax.service.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.ConverterDataToObject;
import core.basesyntax.service.GetterTransactions;
import java.util.ArrayList;
import java.util.List;

public class GetterTransactionsImpl implements GetterTransactions {
    private static final String RECORD_SEPARATOR = ";";
    private final ConverterDataToObject converterDataToObject = new ConverterDataToObjectImpl();

    @Override
    public List<FruitTransaction> getTransactions(String data) {
        List<FruitTransaction> result = new ArrayList<>();
        String[] records = data.split(RECORD_SEPARATOR);
        for (String record : records) {
            result.add(converterDataToObject.convertDataToObject(record));
        }
        return result;
    }
}
