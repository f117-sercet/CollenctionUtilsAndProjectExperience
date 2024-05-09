package wordContentInterface.factory;

import com.wordContent.WordContentTypeEnum;
import wordContentInterface.GenerateWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Description： 生成Word工厂
 *
 * @author: 段世超
 * @aate: Created in 2024/5/9 18:07
 */
public class GenerateWordFactory {
    private static final Map<WordContentTypeEnum, GenerateWord> TYPE_BACK_DATA = new HashMap<>();

    public static void register(WordContentTypeEnum typeEnum,GenerateWord word){
        if (Objects.nonNull(typeEnum)){
            TYPE_BACK_DATA.put(typeEnum, word);
        }
    }

    public static GenerateWord getBackData(WordContentTypeEnum typeEnum){
        return TYPE_BACK_DATA.get(typeEnum);
    }
}
