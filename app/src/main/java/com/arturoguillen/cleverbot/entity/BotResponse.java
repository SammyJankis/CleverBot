package com.arturoguillen.cleverbot.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by PC on 21/02/2017.
 */

public class BotResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("cs")
    public String cs;

    @SerializedName("interaction_count")
    public String interactionCount;

    @SerializedName("input")
    public String input;

    @SerializedName("input_label")
    public String inputLabel;

    @SerializedName("predicted_input")
    public String predictedInput;

    @SerializedName("accuracy")
    public String accuracy;

    @SerializedName("output_label")
    public String outputLabel;

    @SerializedName("output")
    public String output;

    @SerializedName("conversation_id")
    public String conversationId;

    @SerializedName("errorline")
    public String errorline;

    @SerializedName("database_version")
    public String databaseVersion;

    @SerializedName("software_version")
    public String softwareVersion;

    @SerializedName("time_taken")
    public String timeTaken;

    @SerializedName("random_number")
    public String randomNumber;

    @SerializedName("time_second")
    public String timeSecond;

    @SerializedName("time_minute")
    public String timeMinute;

    @SerializedName("time_hour")
    public String timeHour;

    @SerializedName("time_day_of_week")
    public String timeDayOfWeek;

    @SerializedName("time_day")
    public String timeDay;

    @SerializedName("time_month")
    public String timeMonth;

    @SerializedName("time_year")
    public String timeYear;

    @SerializedName("reaction")
    public String reaction;

    @SerializedName("reaction_tone")
    public String reactionTone;

    @SerializedName("emotion")
    public String emotion;

    @SerializedName("emotion_tone")
    public String emotionTone;

    @SerializedName("clever_accuracy")
    public String cleverAccuracy;

    @SerializedName("clever_output")
    public String cleverOutput;

    @SerializedName("clever_match")
    public String cleverMatch;

    @SerializedName("CSRES30")
    public String cSRES30;

    @SerializedName("time_elapsed")
    public String timeElapsed;

    @SerializedName("filtered_input")
    public String filteredInput;

    @SerializedName("reaction_degree")
    public String reactionDegree;

    @SerializedName("emotion_degree")
    public String emotionDegree;

    @SerializedName("reaction_values")
    public String reactionValues;

    @SerializedName("emotion_values")
    public String emotionValues;

    @SerializedName("callback")
    public String callback;

    @SerializedName("interaction_1")
    public String interaction1;

    @SerializedName("interaction_1_other")
    public String interaction1Other;

    @SerializedName("interaction_2")
    public String interaction2;

    @SerializedName("interaction_3")
    public String interaction3;

    @SerializedName("interaction_4")
    public String interaction4;

    @SerializedName("interaction_5")
    public String interaction5;

    @SerializedName("interaction_6")
    public String interaction6;

    @SerializedName("interaction_7")
    public String interaction7;

    @SerializedName("interaction_8")
    public String interaction8;

    @SerializedName("interaction_9")
    public String interaction9;

    @SerializedName("interaction_10")
    public String interaction10;

    @SerializedName("interaction_11")
    public String interaction11;

    @SerializedName("interaction_12")
    public String interaction12;

    @SerializedName("interaction_13")
    public String interaction13;

    @SerializedName("interaction_14")
    public String interaction14;

    @SerializedName("interaction_15")
    public String interaction15;

    @SerializedName("interaction_16")
    public String interaction16;

    @SerializedName("interaction_17")
    public String interaction17;

    @SerializedName("interaction_18")
    public String interaction18;

    @SerializedName("interaction_19")
    public String interaction19;

    @SerializedName("interaction_20")
    public String interaction20;

    @SerializedName("interaction_21")
    public String interaction21;

    @SerializedName("interaction_22")
    public String interaction22;

    @SerializedName("interaction_23")
    public String interaction23;

    @SerializedName("interaction_24")
    public String interaction24;

    @SerializedName("interaction_25")
    public String interaction25;

    @SerializedName("interaction_26")
    public String interaction26;

    @SerializedName("interaction_27")
    public String interaction27;

    @SerializedName("interaction_28")
    public String interaction28;

    @SerializedName("interaction_29")
    public String interaction29;

    @SerializedName("interaction_30")
    public String interaction30;

    @SerializedName("interaction_31")
    public String interaction31;

    @SerializedName("interaction_32")
    public String interaction32;

    @SerializedName("interaction_33")
    public String interaction33;

    @SerializedName("interaction_34")
    public String interaction34;

    @SerializedName("interaction_35")
    public String interaction35;

    @SerializedName("interaction_36")
    public String interaction36;

    @SerializedName("interaction_37")
    public String interaction37;

    @SerializedName("interaction_38")
    public String interaction38;

    @SerializedName("interaction_39")
    public String interaction39;

    @SerializedName("interaction_40")
    public String interaction40;

    @SerializedName("interaction_41")
    public String interaction41;

    @SerializedName("interaction_42")
    public String interaction42;

    @SerializedName("interaction_43")
    public String interaction43;

    @SerializedName("interaction_44")
    public String interaction44;

    @SerializedName("interaction_45")
    public String interaction45;

    @SerializedName("interaction_46")
    public String interaction46;

    @SerializedName("interaction_47")
    public String interaction47;

    @SerializedName("interaction_48")
    public String interaction48;

    @SerializedName("interaction_49")
    public String interaction49;

    @SerializedName("interaction_50")
    public String interaction50;

    public BotResponse() {
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getInteractionCount() {
        return interactionCount;
    }

    public void setInteractionCount(String interactionCount) {
        this.interactionCount = interactionCount;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInputLabel() {
        return inputLabel;
    }

    public void setInputLabel(String inputLabel) {
        this.inputLabel = inputLabel;
    }

    public String getPredictedInput() {
        return predictedInput;
    }

    public void setPredictedInput(String predictedInput) {
        this.predictedInput = predictedInput;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getOutputLabel() {
        return outputLabel;
    }

    public void setOutputLabel(String outputLabel) {
        this.outputLabel = outputLabel;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getErrorline() {
        return errorline;
    }

    public void setErrorline(String errorline) {
        this.errorline = errorline;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
    }

    public String getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getTimeSecond() {
        return timeSecond;
    }

    public void setTimeSecond(String timeSecond) {
        this.timeSecond = timeSecond;
    }

    public String getTimeMinute() {
        return timeMinute;
    }

    public void setTimeMinute(String timeMinute) {
        this.timeMinute = timeMinute;
    }

    public String getTimeHour() {
        return timeHour;
    }

    public void setTimeHour(String timeHour) {
        this.timeHour = timeHour;
    }

    public String getTimeDayOfWeek() {
        return timeDayOfWeek;
    }

    public void setTimeDayOfWeek(String timeDayOfWeek) {
        this.timeDayOfWeek = timeDayOfWeek;
    }

    public String getTimeDay() {
        return timeDay;
    }

    public void setTimeDay(String timeDay) {
        this.timeDay = timeDay;
    }

    public String getTimeMonth() {
        return timeMonth;
    }

    public void setTimeMonth(String timeMonth) {
        this.timeMonth = timeMonth;
    }

    public String getTimeYear() {
        return timeYear;
    }

    public void setTimeYear(String timeYear) {
        this.timeYear = timeYear;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getReactionTone() {
        return reactionTone;
    }

    public void setReactionTone(String reactionTone) {
        this.reactionTone = reactionTone;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public String getEmotionTone() {
        return emotionTone;
    }

    public void setEmotionTone(String emotionTone) {
        this.emotionTone = emotionTone;
    }

    public String getCleverAccuracy() {
        return cleverAccuracy;
    }

    public void setCleverAccuracy(String cleverAccuracy) {
        this.cleverAccuracy = cleverAccuracy;
    }

    public String getCleverOutput() {
        return cleverOutput;
    }

    public void setCleverOutput(String cleverOutput) {
        this.cleverOutput = cleverOutput;
    }

    public String getCleverMatch() {
        return cleverMatch;
    }

    public void setCleverMatch(String cleverMatch) {
        this.cleverMatch = cleverMatch;
    }

    public String getcSRES30() {
        return cSRES30;
    }

    public void setcSRES30(String cSRES30) {
        this.cSRES30 = cSRES30;
    }

    public String getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(String timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public String getFilteredInput() {
        return filteredInput;
    }

    public void setFilteredInput(String filteredInput) {
        this.filteredInput = filteredInput;
    }

    public String getReactionDegree() {
        return reactionDegree;
    }

    public void setReactionDegree(String reactionDegree) {
        this.reactionDegree = reactionDegree;
    }

    public String getEmotionDegree() {
        return emotionDegree;
    }

    public void setEmotionDegree(String emotionDegree) {
        this.emotionDegree = emotionDegree;
    }

    public String getReactionValues() {
        return reactionValues;
    }

    public void setReactionValues(String reactionValues) {
        this.reactionValues = reactionValues;
    }

    public String getEmotionValues() {
        return emotionValues;
    }

    public void setEmotionValues(String emotionValues) {
        this.emotionValues = emotionValues;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getInteraction1() {
        return interaction1;
    }

    public void setInteraction1(String interaction1) {
        this.interaction1 = interaction1;
    }

    public String getInteraction1Other() {
        return interaction1Other;
    }

    public void setInteraction1Other(String interaction1Other) {
        this.interaction1Other = interaction1Other;
    }

    public String getInteraction2() {
        return interaction2;
    }

    public void setInteraction2(String interaction2) {
        this.interaction2 = interaction2;
    }

    public String getInteraction3() {
        return interaction3;
    }

    public void setInteraction3(String interaction3) {
        this.interaction3 = interaction3;
    }

    public String getInteraction4() {
        return interaction4;
    }

    public void setInteraction4(String interaction4) {
        this.interaction4 = interaction4;
    }

    public String getInteraction5() {
        return interaction5;
    }

    public void setInteraction5(String interaction5) {
        this.interaction5 = interaction5;
    }

    public String getInteraction6() {
        return interaction6;
    }

    public void setInteraction6(String interaction6) {
        this.interaction6 = interaction6;
    }

    public String getInteraction7() {
        return interaction7;
    }

    public void setInteraction7(String interaction7) {
        this.interaction7 = interaction7;
    }

    public String getInteraction8() {
        return interaction8;
    }

    public void setInteraction8(String interaction8) {
        this.interaction8 = interaction8;
    }

    public String getInteraction9() {
        return interaction9;
    }

    public void setInteraction9(String interaction9) {
        this.interaction9 = interaction9;
    }

    public String getInteraction10() {
        return interaction10;
    }

    public void setInteraction10(String interaction10) {
        this.interaction10 = interaction10;
    }

    public String getInteraction11() {
        return interaction11;
    }

    public void setInteraction11(String interaction11) {
        this.interaction11 = interaction11;
    }

    public String getInteraction12() {
        return interaction12;
    }

    public void setInteraction12(String interaction12) {
        this.interaction12 = interaction12;
    }

    public String getInteraction13() {
        return interaction13;
    }

    public void setInteraction13(String interaction13) {
        this.interaction13 = interaction13;
    }

    public String getInteraction14() {
        return interaction14;
    }

    public void setInteraction14(String interaction14) {
        this.interaction14 = interaction14;
    }

    public String getInteraction15() {
        return interaction15;
    }

    public void setInteraction15(String interaction15) {
        this.interaction15 = interaction15;
    }

    public String getInteraction16() {
        return interaction16;
    }

    public void setInteraction16(String interaction16) {
        this.interaction16 = interaction16;
    }

    public String getInteraction17() {
        return interaction17;
    }

    public void setInteraction17(String interaction17) {
        this.interaction17 = interaction17;
    }

    public String getInteraction18() {
        return interaction18;
    }

    public void setInteraction18(String interaction18) {
        this.interaction18 = interaction18;
    }

    public String getInteraction19() {
        return interaction19;
    }

    public void setInteraction19(String interaction19) {
        this.interaction19 = interaction19;
    }

    public String getInteraction20() {
        return interaction20;
    }

    public void setInteraction20(String interaction20) {
        this.interaction20 = interaction20;
    }

    public String getInteraction21() {
        return interaction21;
    }

    public void setInteraction21(String interaction21) {
        this.interaction21 = interaction21;
    }

    public String getInteraction22() {
        return interaction22;
    }

    public void setInteraction22(String interaction22) {
        this.interaction22 = interaction22;
    }

    public String getInteraction23() {
        return interaction23;
    }

    public void setInteraction23(String interaction23) {
        this.interaction23 = interaction23;
    }

    public String getInteraction24() {
        return interaction24;
    }

    public void setInteraction24(String interaction24) {
        this.interaction24 = interaction24;
    }

    public String getInteraction25() {
        return interaction25;
    }

    public void setInteraction25(String interaction25) {
        this.interaction25 = interaction25;
    }

    public String getInteraction26() {
        return interaction26;
    }

    public void setInteraction26(String interaction26) {
        this.interaction26 = interaction26;
    }

    public String getInteraction27() {
        return interaction27;
    }

    public void setInteraction27(String interaction27) {
        this.interaction27 = interaction27;
    }

    public String getInteraction28() {
        return interaction28;
    }

    public void setInteraction28(String interaction28) {
        this.interaction28 = interaction28;
    }

    public String getInteraction29() {
        return interaction29;
    }

    public void setInteraction29(String interaction29) {
        this.interaction29 = interaction29;
    }

    public String getInteraction30() {
        return interaction30;
    }

    public void setInteraction30(String interaction30) {
        this.interaction30 = interaction30;
    }

    public String getInteraction31() {
        return interaction31;
    }

    public void setInteraction31(String interaction31) {
        this.interaction31 = interaction31;
    }

    public String getInteraction32() {
        return interaction32;
    }

    public void setInteraction32(String interaction32) {
        this.interaction32 = interaction32;
    }

    public String getInteraction33() {
        return interaction33;
    }

    public void setInteraction33(String interaction33) {
        this.interaction33 = interaction33;
    }

    public String getInteraction34() {
        return interaction34;
    }

    public void setInteraction34(String interaction34) {
        this.interaction34 = interaction34;
    }

    public String getInteraction35() {
        return interaction35;
    }

    public void setInteraction35(String interaction35) {
        this.interaction35 = interaction35;
    }

    public String getInteraction36() {
        return interaction36;
    }

    public void setInteraction36(String interaction36) {
        this.interaction36 = interaction36;
    }

    public String getInteraction37() {
        return interaction37;
    }

    public void setInteraction37(String interaction37) {
        this.interaction37 = interaction37;
    }

    public String getInteraction38() {
        return interaction38;
    }

    public void setInteraction38(String interaction38) {
        this.interaction38 = interaction38;
    }

    public String getInteraction39() {
        return interaction39;
    }

    public void setInteraction39(String interaction39) {
        this.interaction39 = interaction39;
    }

    public String getInteraction40() {
        return interaction40;
    }

    public void setInteraction40(String interaction40) {
        this.interaction40 = interaction40;
    }

    public String getInteraction41() {
        return interaction41;
    }

    public void setInteraction41(String interaction41) {
        this.interaction41 = interaction41;
    }

    public String getInteraction42() {
        return interaction42;
    }

    public void setInteraction42(String interaction42) {
        this.interaction42 = interaction42;
    }

    public String getInteraction43() {
        return interaction43;
    }

    public void setInteraction43(String interaction43) {
        this.interaction43 = interaction43;
    }

    public String getInteraction44() {
        return interaction44;
    }

    public void setInteraction44(String interaction44) {
        this.interaction44 = interaction44;
    }

    public String getInteraction45() {
        return interaction45;
    }

    public void setInteraction45(String interaction45) {
        this.interaction45 = interaction45;
    }

    public String getInteraction46() {
        return interaction46;
    }

    public void setInteraction46(String interaction46) {
        this.interaction46 = interaction46;
    }

    public String getInteraction47() {
        return interaction47;
    }

    public void setInteraction47(String interaction47) {
        this.interaction47 = interaction47;
    }

    public String getInteraction48() {
        return interaction48;
    }

    public void setInteraction48(String interaction48) {
        this.interaction48 = interaction48;
    }

    public String getInteraction49() {
        return interaction49;
    }

    public void setInteraction49(String interaction49) {
        this.interaction49 = interaction49;
    }

    public String getInteraction50() {
        return interaction50;
    }

    public void setInteraction50(String interaction50) {
        this.interaction50 = interaction50;
    }
}
