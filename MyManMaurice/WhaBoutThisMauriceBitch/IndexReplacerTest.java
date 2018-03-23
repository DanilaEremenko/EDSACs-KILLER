package WhaBoutThisMauriceBitch;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class IndexReplacerTest {

    @Test
    public void alphabetMake() {
        HashMap<String, Integer> rightAlphabet = new HashMap<>();
        rightAlphabet.put("<a>", 1);
        rightAlphabet.put("<b>", 2);

        String input = "skdksdkds var_a_var\n" +
                "adsadsads var_b_var";
        HashMap<String, Integer> alphabet = IndexReplacer.alphabetMake(input);
        assertEquals(alphabet, rightAlphabet);

    }

    @Test
    public void replaceIndices() {

    }

    @Test
    public void deleteComments() {
        String input1 = "asadsad[asdsadsadsadsadsad]";
        String output1 = "asadsad";
        assertEquals(IndexReplacer.deleteComments(input1), output1);

        String input2 = "asadsad[asdsadsadsadsadsad]\n\t" +
                "asadsad[asdsadsadsadsadsad]";
        String output2 = "asadsad\n\t" +
                "asadsad";
        assertEquals(IndexReplacer.deleteComments(input2), output2);

    }

    @Test
    public void realtest() {
        String input = realExampleInput();
        String output = realExampleOutput();
        HashMap<String, Integer> alphabet = IndexReplacer.alphabetMake(input);

        input = IndexReplacer.deleteComments(input);
        output = IndexReplacer.deleteComments(output);

        assertEquals(output, IndexReplacer.replaceIndices(input, alphabet));

    }

    @Test
    public void easyWay() {
        String output = IndexReplacer.deleteComments(realExampleOutput());
        assertEquals(output, IndexReplacer.easyWay(realExampleInput(), false));

    }



    private String realExampleInput() {
        return "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "T<delete>S[var_start_var]\n" +
                "[]A<defDigit_copy>S[defDigit_copy, Считаем переполнения из + в -]\n" +
                "A<defDigit>S[defDigit]\n" +
                "T<defDigit_copy>S[defDigit_copy сохраняем]\n" +
                "[goto ]E110S[void -1_fromIndex,Безусловное вычитание 1]\n" +
                "A<defDigit_copy>S[defDigit_copy]\n" +
                "[goto]G<void add_One_To_CurrentRazr (+)->(-)>S[var_jump1_var,void add_One_To_CurrentRazr (+)->(-)]\n" +
                "[goto]E<start>S[start]\n" +
                "T<delete>[start 2]\n" +
                "[]A<defDigit_copy>S[defDigit_copy,var_start 2_var]\n" +
                "A<defDigit>S\n" +
                "T<defDigit_copy>S[defDigit_copy сохраняем]\n" +
                "[goto]E<void subtOnefromIndex2>S[void -1_fromIndex,Безусловное вычитание 1]\n" +
                "A<defDigit_copy>S[defDigit_copy]\n" +
                "[goto 2]E<void add_One_To_CurrentRazr (-)->(+)>S[var_jump2_var,void add_One_To_CurrentRazr (-)->(+)]\n" +
                "[goto]G<start 2>S[start 2]\n" +
                "A<index>S[index]\n" +
                "E<start>S[var_cycleEnd_var,start,Проверяем что цикл не закончился]\n" +
                "[]T<delete>S[var_nextLongStep_var, Провярем не закончилось ли заполнение]\n" +
                "A<число заполняемых разрядов>S[число заполняемых разрядов]\n" +
                "S<ONE>S[ONE]\n" +
                "U<число заполняемых разрядов>S\n" +
                "G<exit>S[exit]\n" +
                "[]T<delete>S[Сдвигаем исходное число влево на 1]\n" +
                "A<defDigit>S[defDig]\n" +
                "L0L\n" +
                "U<defDigit>S[сохраняем изменения]\n" +
                "U<defDigit_copy>S[сохраняем изменения]\n" +
                "[]T<delete>S[index=9]\n" +
                "A<defIndex>S[defIndex]\n" +
                "T<index>S[index]\n" +
                "[]T<delete>S[Меняем индексы в методах add_One_To_CurrentRazr]\n" +
                "A<TWO>S[TWO_FOR_CHANGE_RAZR]\n" +
                "A<changedInstructionOne>S[]\n" +
                "T<changedInstructionOne>S\n" +
                "A<TWO>S[TWO_FOR_CHANGE_RAZR]\n" +
                "A<changedInstructionTwo>S[]\n" +
                "T<changedInstructionTwo>S\n" +
                "A<TWO>S[TWO_FOR_CHANGE_RAZR]\n" +
                "A<changedInstructionThree>S[]\n" +
                "T<changedInstructionThree>S\n" +
                "A<TWO>S[TWO_FOR_CHANGE_RAZR]\n" +
                "A<changedInstructionFour>S\n" +
                "T<changedInstructionFour>S\n" +
                "E<start>S[start,БЕЗУСЛОВНО]\n" +
                "Z0S[var_exit_var-----------------КОНСТАНТЫ---------------]\n" +
                "S0S[var_defDigit_var=0.75]\n" +
                "S0S[var_defDigit_copy_var=0.75]\n" +
                "P0L[var_ONE_var]\n" +
                "P0L[var_defIndex_var i=9]\n" +
                "P0L[var_index_var i=9]\n" +
                "P1S[var_TWO_var,для изменения индекс текущего разряда]\n" +
                "P8S[var_число заполняемых разрядов_var]\n" +
                "P0S[var_firstRazr_var]\n" +
                "P0S[2 разряд]\n" +
                "P0S[3 разряд]\n" +
                "P0S[4 разряд]\n" +
                "P0S[5 разряд]\n" +
                "P0S[6 разряд]\n" +
                "P0S[7 разряд]\n" +
                "P0S[8 разряд]\n" +
                "P0S[9 разряд]\n" +
                "P0S[10 разряд]\n" +
                "P0S[11 разряд]\n" +
                "P0S[12 разряд]\n" +
                "P0S[13 разряд]\n" +
                "P0S[14 разряд]\n" +
                "P0S[15 разряд]\n" +
                "P0S[16 разряд------------МЕТОДЫ---------------]\n" +
                "[1]T<delete>S[var_void add_One_To_CurrentRazr (+)->(-)_var]\n" +
                "A<firstRazr>S[1 разряд,var_changedInstructionOne_var]\n" +
                "A<ONE>S\n" +
                "T<firstRazr>S[1 разряд,var_changedInstructionTwo_var ]\n" +
                "E<start 2>S[goto+2,БЕЗУСЛОВНО]\n" +
                "[2]T<delete>S[var_void add_One_To_CurrentRazr (-)->(+)_var]\n" +
                "A<firstRazr>S[1 разряд,var_changedInstructionThree_var]\n" +
                "A<ONE>S[ONE]\n" +
                "T<firstRazr>S[1 разряд,var_changedInstructionFour_var]\n" +
                "E<cycleEnd>S[goto+2,БЕЗУСЛОВНО]\n" +
                "[1]T<delete>S[var_void subtOnefromIndex1_var]\n" +
                "A<index>S[index, Вычитаем 1 из текущего состояния цикла]\n" +
                "G<nextLongStep>S[проверка индекса массива]\n" +
                "S<ONE>S[ONE, Вычитаем 1]\n" +
                "T<index>S[index, Сохраняем в переменную цикла]\n" +
                "E<jump1>S[goto+1,БЕЗУСЛОВНО]\n" +
                "[2]T<delete>S[var_void subtOnefromIndex2_var]\n" +
                "A<index>S[index, Вычитаем 1 из текущего состояния цикла]\n" +
                "G<nextLongStep>S[проверка индекса массива]\n" +
                "S<ONE>S[ONE, Вычитаем 1]\n" +
                "T<index>S[index, Сохраняем в переменную цикла]\n" +
                "E<jump2>S[goto+1,БЕЗУСЛОВНО]\n" +
                "Z0S\n" +
                "var_delete_var\n";
    }

    private String realExampleOutput() {
        return "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "T123S[start]\n" +
                "[]A78S[defDigit_copy, Считаем переполнения из + в -]\n" +
                "A77S\n" +
                "T78S[defDigit_copy сохраняем]\n" +
                "[goto ]E110S[void -1_fromIndex,Безусловное вычитание 1]\n" +
                "A78S[defDigit_copy]\n" +
                "[goto]G100S[void add_One_To_CurrentRazr (+)->(-)]\n" +
                "[goto]E31S[start]\n" +
                "T123[start 2]\n" +
                "[]A78S[defDigit_copy, Считаем переполнения из - в +]\n" +
                "A77S\n" +
                "T78S[defDigit_copy сохраняем]\n" +
                "[goto]E116S[void -1_fromIndex,Безусловное вычитание 1]\n" +
                "A78S[defDigit_copy]\n" +
                "[goto 2]E105S[void add_One_To_CurrentRazr (-)->(+)]\n" +
                "[goto]G40S[start 2]\n" +
                "A81S[index]\n" +
                "E31S[start,Проверяем что цикл не закончился]\n" +
                "[]T123S[Провярем не закончилось ли заполнение]\n" +
                "A83S[число заполняемых разрядов]\n" +
                "S79S[ONE]\n" +
                "U83S\n" +
                "G76S[end]\n" +
                "[]T123S[Сдвигаем исходное число влево на 1]\n" +
                "A77S[defDig]\n" +
                "L0L\n" +
                "U77S[сохраняем изменения]\n" +
                "U78S[сохраняем изменения]\n" +
                "[]T123S[index=9]\n" +
                "A80S[defIndex]\n" +
                "T81S[index]\n" +
                "[]T123S[Меняем индексы в методах add_One_To_CurrentRazr]\n" +
                "A82S[TWO_FOR_CHANGE_RAZR]\n" +
                "A101S[]\n" +
                "T101S\n" +
                "A82S[TWO_FOR_CHANGE_RAZR]\n" +
                "A103S[]\n" +
                "T103S\n" +
                "A82S[TWO_FOR_CHANGE_RAZR]\n" +
                "A106S[]\n" +
                "T106S\n" +
                "A82S[TWO_FOR_CHANGE_RAZR]\n" +
                "A108S\n" +
                "T108S\n" +
                "E31S[start,БЕЗУСЛОВНО]\n" +
                "Z0S[end-----------------КОНСТАНТЫ---------------]\n" +
                "S0S[defDig=0.75]\n" +
                "S0S[defDig_copy=0.75]\n" +
                "P0L[ONE]\n" +
                "P0L[defIndex i=9]\n" +
                "P0L[index i=9]\n" +
                "P1S[TWO,для изменения индекс текущего разряда]\n" +
                "P8S[число заполняемых разрядов]\n" +
                "P0S[1 разряд]\n" +
                "P0S[2 разряд]\n" +
                "P0S[3 разряд]\n" +
                "P0S[4 разряд]\n" +
                "P0S[5 разряд]\n" +
                "P0S[6 разряд]\n" +
                "P0S[7 разряд]\n" +
                "P0S[8 разряд]\n" +
                "P0S[9 разряд]\n" +
                "P0S[10 разряд]\n" +
                "P0S[11 разряд]\n" +
                "P0S[12 разряд]\n" +
                "P0S[13 разряд]\n" +
                "P0S[14 разряд]\n" +
                "P0S[15 разряд]\n" +
                "P0S[16 разряд------------МЕТОДЫ---------------]\n" +
                "[1]T123S[void add_One_To_CurrentRazr (+)->(-)]\n" +
                "A84S[1 разряд]\n" +
                "A79S[ONE]\n" +
                "T84S[1 разряд]\n" +
                "E40S[goto+2,БЕЗУСЛОВНО]\n" +
                "[2]T123S[void add_One_To_CurrentRazr (-)->(+)]\n" +
                "A84S[1 разряд]\n" +
                "A79S[ONE]\n" +
                "T84S[1 разряд]\n" +
                "E48S[goto+2,БЕЗУСЛОВНО]\n" +
                "[1]T123S[void -1_fromIndex]\n" +
                "A81S[index, Вычитаем 1 из текущего состояния цикла]\n" +
                "G49S[проверка индекса массива]\n" +
                "S79S[ONE, Вычитаем 1]\n" +
                "T81S[index, Сохраняем в переменную цикла]\n" +
                "E37S[goto+1,БЕЗУСЛОВНО]\n" +
                "[2]T123S[void -1_fromIndex]\n" +
                "A81S[index, Вычитаем 1 из текущего состояния цикла]\n" +
                "G49S[проверка индекса массива]\n" +
                "S79S[ONE, Вычитаем 1]\n" +
                "T81S[index, Сохраняем в переменную цикла]\n" +
                "E45S[goto+1,БЕЗУСЛОВНО]\n" +
                "Z0S\n";
    }

}