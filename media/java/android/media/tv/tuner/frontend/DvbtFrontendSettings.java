/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.media.tv.tuner.frontend;

import android.annotation.IntDef;
import android.annotation.NonNull;
import android.annotation.RequiresPermission;
import android.content.Context;
import android.hardware.tv.tuner.V1_0.Constants;
import android.media.tv.tuner.TunerUtils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Frontend settings for DVBT.
 * @hide
 */
public class DvbtFrontendSettings extends FrontendSettings {

    /** @hide */
    @IntDef(flag = true,
            prefix = "TRANSMISSION_MODE_",
            value = {TRANSMISSION_MODE_UNDEFINED, TRANSMISSION_MODE_AUTO,
                    TRANSMISSION_MODE_2K, TRANSMISSION_MODE_8K, TRANSMISSION_MODE_4K,
                    TRANSMISSION_MODE_1K, TRANSMISSION_MODE_16K, TRANSMISSION_MODE_32K})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransmissionMode {}

    /**
     * Transmission Mode undefined.
     */
    public static final int TRANSMISSION_MODE_UNDEFINED =
            Constants.FrontendDvbtTransmissionMode.UNDEFINED;
    /**
     * Hardware is able to detect and set Transmission Mode automatically
     */
    public static final int TRANSMISSION_MODE_AUTO = Constants.FrontendDvbtTransmissionMode.AUTO;
    /**
     * 2K Transmission Mode.
     */
    public static final int TRANSMISSION_MODE_2K = Constants.FrontendDvbtTransmissionMode.MODE_2K;
    /**
     * 8K Transmission Mode.
     */
    public static final int TRANSMISSION_MODE_8K = Constants.FrontendDvbtTransmissionMode.MODE_8K;
    /**
     * 4K Transmission Mode.
     */
    public static final int TRANSMISSION_MODE_4K = Constants.FrontendDvbtTransmissionMode.MODE_4K;
    /**
     * 1K Transmission Mode.
     */
    public static final int TRANSMISSION_MODE_1K = Constants.FrontendDvbtTransmissionMode.MODE_1K;
    /**
     * 16K Transmission Mode.
     */
    public static final int TRANSMISSION_MODE_16K = Constants.FrontendDvbtTransmissionMode.MODE_16K;
    /**
     * 32K Transmission Mode.
     */
    public static final int TRANSMISSION_MODE_32K = Constants.FrontendDvbtTransmissionMode.MODE_32K;



    /** @hide */
    @IntDef(flag = true,
            prefix = "BANDWIDTH_",
            value = {BANDWIDTH_UNDEFINED, BANDWIDTH_AUTO, BANDWIDTH_8MHZ, BANDWIDTH_7MHZ,
                    BANDWIDTH_6MHZ, BANDWIDTH_5MHZ, BANDWIDTH_1_7MHZ, BANDWIDTH_10MHZ})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Bandwidth {}

    /**
     * Bandwidth undefined.
     */
    public static final int BANDWIDTH_UNDEFINED = Constants.FrontendDvbtBandwidth.UNDEFINED;
    /**
     * Hardware is able to detect and set Bandwidth automatically.
     */
    public static final int BANDWIDTH_AUTO = Constants.FrontendDvbtBandwidth.AUTO;
    /**
     * 8 MHz bandwidth.
     */
    public static final int BANDWIDTH_8MHZ = Constants.FrontendDvbtBandwidth.BANDWIDTH_8MHZ;
    /**
     * 7 MHz bandwidth.
     */
    public static final int BANDWIDTH_7MHZ = Constants.FrontendDvbtBandwidth.BANDWIDTH_7MHZ;
    /**
     * 6 MHz bandwidth.
     */
    public static final int BANDWIDTH_6MHZ = Constants.FrontendDvbtBandwidth.BANDWIDTH_6MHZ;
    /**
     * 5 MHz bandwidth.
     */
    public static final int BANDWIDTH_5MHZ = Constants.FrontendDvbtBandwidth.BANDWIDTH_5MHZ;
    /**
     * 1,7 MHz bandwidth.
     */
    public static final int BANDWIDTH_1_7MHZ = Constants.FrontendDvbtBandwidth.BANDWIDTH_1_7MHZ;
    /**
     * 10 MHz bandwidth.
     */
    public static final int BANDWIDTH_10MHZ = Constants.FrontendDvbtBandwidth.BANDWIDTH_10MHZ;


    /** @hide */
    @IntDef(flag = true,
            prefix = "CONSTELLATION_",
            value = {CONSTELLATION_UNDEFINED, CONSTELLATION_AUTO, CONSTELLATION_CONSTELLATION_QPSK,
                    CONSTELLATION_CONSTELLATION_16QAM, CONSTELLATION_CONSTELLATION_64QAM,
                    CONSTELLATION_CONSTELLATION_256QAM})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Constellation {}

    /**
     * Constellation not defined.
     */
    public static final int CONSTELLATION_UNDEFINED = Constants.FrontendDvbtConstellation.UNDEFINED;
    /**
     * Hardware is able to detect and set Constellation automatically.
     */
    public static final int CONSTELLATION_AUTO = Constants.FrontendDvbtConstellation.AUTO;
    /**
     * QPSK Constellation.
     */
    public static final int CONSTELLATION_CONSTELLATION_QPSK =
            Constants.FrontendDvbtConstellation.CONSTELLATION_QPSK;
    /**
     * 16QAM Constellation.
     */
    public static final int CONSTELLATION_CONSTELLATION_16QAM =
            Constants.FrontendDvbtConstellation.CONSTELLATION_16QAM;
    /**
     * 64QAM Constellation.
     */
    public static final int CONSTELLATION_CONSTELLATION_64QAM =
            Constants.FrontendDvbtConstellation.CONSTELLATION_64QAM;
    /**
     * 256QAM Constellation.
     */
    public static final int CONSTELLATION_CONSTELLATION_256QAM =
            Constants.FrontendDvbtConstellation.CONSTELLATION_256QAM;


    /** @hide */
    @IntDef(flag = true,
            prefix = "HIERARCHY_",
            value = {HIERARCHY_UNDEFINED, HIERARCHY_AUTO, HIERARCHY_NON_NATIVE, HIERARCHY_1_NATIVE,
            HIERARCHY_2_NATIVE, HIERARCHY_4_NATIVE, HIERARCHY_NON_INDEPTH, HIERARCHY_1_INDEPTH,
            HIERARCHY_2_INDEPTH, HIERARCHY_4_INDEPTH})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Hierarchy {}

    /**
     * Hierarchy undefined.
     */
    public static final int HIERARCHY_UNDEFINED = Constants.FrontendDvbtHierarchy.UNDEFINED;
    /**
     * Hardware is able to detect and set Hierarchy automatically.
     */
    public static final int HIERARCHY_AUTO = Constants.FrontendDvbtHierarchy.AUTO;
    /**
     * Non-native Hierarchy
     */
    public static final int HIERARCHY_NON_NATIVE =
            Constants.FrontendDvbtHierarchy.HIERARCHY_NON_NATIVE;
    /**
     * 1-native Hierarchy
     */
    public static final int HIERARCHY_1_NATIVE = Constants.FrontendDvbtHierarchy.HIERARCHY_1_NATIVE;
    /**
     * 2-native Hierarchy
     */
    public static final int HIERARCHY_2_NATIVE = Constants.FrontendDvbtHierarchy.HIERARCHY_2_NATIVE;
    /**
     * 4-native Hierarchy
     */
    public static final int HIERARCHY_4_NATIVE = Constants.FrontendDvbtHierarchy.HIERARCHY_4_NATIVE;
    /**
     * Non-indepth Hierarchy
     */
    public static final int HIERARCHY_NON_INDEPTH =
            Constants.FrontendDvbtHierarchy.HIERARCHY_NON_INDEPTH;
    /**
     * 1-indepth Hierarchy
     */
    public static final int HIERARCHY_1_INDEPTH =
            Constants.FrontendDvbtHierarchy.HIERARCHY_1_INDEPTH;
    /**
     * 2-indepth Hierarchy
     */
    public static final int HIERARCHY_2_INDEPTH =
            Constants.FrontendDvbtHierarchy.HIERARCHY_2_INDEPTH;
    /**
     * 4-indepth Hierarchy
     */
    public static final int HIERARCHY_4_INDEPTH =
            Constants.FrontendDvbtHierarchy.HIERARCHY_4_INDEPTH;


    /** @hide */
    @IntDef(flag = true,
            prefix = "CODERATE_",
            value = {CODERATE_UNDEFINED, CODERATE_AUTO, CODERATE_1_2, CODERATE_2_3, CODERATE_3_4,
            CODERATE_5_6, CODERATE_7_8, CODERATE_3_5, CODERATE_4_5, CODERATE_6_7, CODERATE_8_9})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Coderate {}

    /**
     * Code rate undefined.
     */
    public static final int CODERATE_UNDEFINED =
            Constants.FrontendDvbtCoderate.UNDEFINED;
    /**
     * Hardware is able to detect and set code rate automatically.
     */
    public static final int CODERATE_AUTO = Constants.FrontendDvbtCoderate.AUTO;
    /**
     * 1/2 code rate.
     */
    public static final int CODERATE_1_2 = Constants.FrontendDvbtCoderate.CODERATE_1_2;
    /**
     * 2/3 code rate.
     */
    public static final int CODERATE_2_3 = Constants.FrontendDvbtCoderate.CODERATE_2_3;
    /**
     * 3/4 code rate.
     */
    public static final int CODERATE_3_4 = Constants.FrontendDvbtCoderate.CODERATE_3_4;
    /**
     * 5/6 code rate.
     */
    public static final int CODERATE_5_6 = Constants.FrontendDvbtCoderate.CODERATE_5_6;
    /**
     * 7/8 code rate.
     */
    public static final int CODERATE_7_8 = Constants.FrontendDvbtCoderate.CODERATE_7_8;
    /**
     * 4/5 code rate.
     */
    public static final int CODERATE_3_5 = Constants.FrontendDvbtCoderate.CODERATE_3_5;
    /**
     * 4/5 code rate.
     */
    public static final int CODERATE_4_5 = Constants.FrontendDvbtCoderate.CODERATE_4_5;
    /**
     * 6/7 code rate.
     */
    public static final int CODERATE_6_7 = Constants.FrontendDvbtCoderate.CODERATE_6_7;
    /**
     * 8/9 code rate.
     */
    public static final int CODERATE_8_9 = Constants.FrontendDvbtCoderate.CODERATE_8_9;

    /** @hide */
    @IntDef(flag = true,
            prefix = "GUARD_INTERVAL_",
            value = {GUARD_INTERVAL_UNDEFINED, GUARD_INTERVAL_AUTO,
            GUARD_INTERVAL_INTERVAL_1_32, GUARD_INTERVAL_INTERVAL_1_16,
            GUARD_INTERVAL_INTERVAL_1_8, GUARD_INTERVAL_INTERVAL_1_4,
            GUARD_INTERVAL_INTERVAL_1_128,
            GUARD_INTERVAL_INTERVAL_19_128,
            GUARD_INTERVAL_INTERVAL_19_256})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GuardInterval {}

    /**
     * Guard Interval undefined.
     */
    public static final int GUARD_INTERVAL_UNDEFINED =
            Constants.FrontendDvbtGuardInterval.UNDEFINED;
    /**
     * Hardware is able to detect and set Guard Interval automatically.
     */
    public static final int GUARD_INTERVAL_AUTO = Constants.FrontendDvbtGuardInterval.AUTO;
    /**
     * 1/32 Guard Interval.
     */
    public static final int GUARD_INTERVAL_INTERVAL_1_32 =
            Constants.FrontendDvbtGuardInterval.INTERVAL_1_32;
    /**
     * 1/16 Guard Interval.
     */
    public static final int GUARD_INTERVAL_INTERVAL_1_16 =
            Constants.FrontendDvbtGuardInterval.INTERVAL_1_16;
    /**
     * 1/8 Guard Interval.
     */
    public static final int GUARD_INTERVAL_INTERVAL_1_8 =
            Constants.FrontendDvbtGuardInterval.INTERVAL_1_8;
    /**
     * 1/4 Guard Interval.
     */
    public static final int GUARD_INTERVAL_INTERVAL_1_4 =
            Constants.FrontendDvbtGuardInterval.INTERVAL_1_4;
    /**
     * 1/128 Guard Interval.
     */
    public static final int GUARD_INTERVAL_INTERVAL_1_128 =
            Constants.FrontendDvbtGuardInterval.INTERVAL_1_128;
    /**
     * 19/128 Guard Interval.
     */
    public static final int GUARD_INTERVAL_INTERVAL_19_128 =
            Constants.FrontendDvbtGuardInterval.INTERVAL_19_128;
    /**
     * 19/256 Guard Interval.
     */
    public static final int GUARD_INTERVAL_INTERVAL_19_256 =
            Constants.FrontendDvbtGuardInterval.INTERVAL_19_256;

    /** @hide */
    @IntDef(flag = true,
            prefix = "STANDARD",
            value = {STANDARD_AUTO, STANDARD_T, STANDARD_T2}
    )
    @Retention(RetentionPolicy.SOURCE)
    public @interface Standard {}

    /**
     * Hardware is able to detect and set Standard automatically.
     */
    public static final int STANDARD_AUTO = Constants.FrontendDvbtStandard.AUTO;
    /**
     * T standard.
     */
    public static final int STANDARD_T = Constants.FrontendDvbtStandard.T;
    /**
     * T2 standard.
     */
    public static final int STANDARD_T2 = Constants.FrontendDvbtStandard.T2;

    /** @hide */
    @IntDef(flag = true,
            prefix = "PLP_MODE_",
            value = {PLP_MODE_UNDEFINED, PLP_MODE_AUTO, PLP_MODE_MANUAL})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlpMode {}

    /**
     * Physical Layer Pipe (PLP) Mode undefined.
     */
    public static final int PLP_MODE_UNDEFINED = Constants.FrontendDvbtPlpMode.UNDEFINED;
    /**
     * Hardware is able to detect and set Physical Layer Pipe (PLP) Mode automatically.
     */
    public static final int PLP_MODE_AUTO = Constants.FrontendDvbtPlpMode.AUTO;
    /**
     * Physical Layer Pipe (PLP) manual Mode.
     */
    public static final int PLP_MODE_MANUAL = Constants.FrontendDvbtPlpMode.MANUAL;


    private final int mTransmissionMode;
    private final int mBandwidth;
    private final int mConstellation;
    private final int mHierarchy;
    private final int mHpCoderate;
    private final int mLpCoderate;
    private final int mGuardInterval;
    private final boolean mIsHighPriority;
    private final int mStandard;
    private final boolean mIsMiso;
    private final int mPlpMode;
    private final int mPlpId;
    private final int mPlpGroupId;

    private DvbtFrontendSettings(int frequency, int transmissionMode, int bandwidth,
            int constellation, int hierarchy, int hpCoderate, int lpCoderate, int guardInterval,
            boolean isHighPriority, int standard, boolean isMiso, int plpMode, int plpId,
            int plpGroupId) {
        super(frequency);
        mTransmissionMode = transmissionMode;
        mBandwidth = bandwidth;
        mConstellation = constellation;
        mHierarchy = hierarchy;
        mHpCoderate = hpCoderate;
        mLpCoderate = lpCoderate;
        mGuardInterval = guardInterval;
        mIsHighPriority = isHighPriority;
        mStandard = standard;
        mIsMiso = isMiso;
        mPlpMode = plpMode;
        mPlpId = plpId;
        mPlpGroupId = plpGroupId;
    }

    /**
     * Gets Transmission Mode.
     */
    @TransmissionMode
    public int getTransmissionMode() {
        return mTransmissionMode;
    }
    /**
     * Gets Bandwidth.
     */
    @Bandwidth
    public int getBandwidth() {
        return mBandwidth;
    }
    /**
     * Gets Constellation.
     */
    @Constellation
    public int getConstellation() {
        return mConstellation;
    }
    /**
     * Gets Hierarchy.
     */
    @Hierarchy
    public int getHierarchy() {
        return mHierarchy;
    }
    /**
     * Gets Code Rate for High Priority level.
     */
    @Coderate
    public int getHpCoderate() {
        return mHpCoderate;
    }
    /**
     * Gets Code Rate for Low Priority level.
     */
    @Coderate
    public int getLpCoderate() {
        return mLpCoderate;
    }
    /**
     * Gets Guard Interval.
     */
    @GuardInterval
    public int getGuardInterval() {
        return mGuardInterval;
    }
    /**
     * Checks whether it's high priority.
     */
    public boolean isHighPriority() {
        return mIsHighPriority;
    }
    /**
     * Gets Standard.
     */
    @Standard
    public int getStandard() {
        return mStandard;
    }
    /**
     * Gets whether it's MISO.
     */
    public boolean isMiso() {
        return mIsMiso;
    }
    /**
     * Gets Physical Layer Pipe (PLP) Mode.
     */
    @PlpMode
    public int getPlpMode() {
        return mPlpMode;
    }
    /**
     * Gets Physical Layer Pipe (PLP) ID.
     */
    public int getPlpId() {
        return mPlpId;
    }
    /**
     * Gets Physical Layer Pipe (PLP) group ID.
     */
    public int getPlpGroupId() {
        return mPlpGroupId;
    }

    /**
     * Creates a builder for {@link DvbtFrontendSettings}.
     *
     * @param context the context of the caller.
     */
    @RequiresPermission(android.Manifest.permission.ACCESS_TV_TUNER)
    @NonNull
    public static Builder builder(@NonNull Context context) {
        TunerUtils.checkTunerPermission(context);
        return new Builder();
    }

    /**
     * Builder for {@link DvbtFrontendSettings}.
     */
    public static class Builder extends FrontendSettings.Builder<Builder> {
        private int mTransmissionMode;
        private int mBandwidth;
        private int mConstellation;
        private int mHierarchy;
        private int mHpCoderate;
        private int mLpCoderate;
        private int mGuardInterval;
        private boolean mIsHighPriority;
        private int mStandard;
        private boolean mIsMiso;
        private int mPlpMode;
        private int mPlpId;
        private int mPlpGroupId;

        private Builder() {
        }

        /**
         * Sets Transmission Mode.
         */
        @NonNull
        public Builder setTransmissionMode(@TransmissionMode int transmissionMode) {
            mTransmissionMode = transmissionMode;
            return this;
        }
        /**
         * Sets Bandwidth.
         */
        @NonNull
        public Builder setBandwidth(@Bandwidth int bandwidth) {
            mBandwidth = bandwidth;
            return this;
        }
        /**
         * Sets Constellation.
         */
        @NonNull
        public Builder setConstellation(@Constellation int constellation) {
            mConstellation = constellation;
            return this;
        }
        /**
         * Sets Hierarchy.
         */
        @NonNull
        public Builder setHierarchy(@Hierarchy int hierarchy) {
            mHierarchy = hierarchy;
            return this;
        }
        /**
         * Sets Code Rate for High Priority level.
         */
        @NonNull
        public Builder setHpCoderate(@Coderate int hpCoderate) {
            mHpCoderate = hpCoderate;
            return this;
        }
        /**
         * Sets Code Rate for Low Priority level.
         */
        @NonNull
        public Builder setLpCoderate(@Coderate int lpCoderate) {
            mLpCoderate = lpCoderate;
            return this;
        }
        /**
         * Sets Guard Interval.
         */
        @NonNull
        public Builder setGuardInterval(@GuardInterval int guardInterval) {
            mGuardInterval = guardInterval;
            return this;
        }
        /**
         * Sets whether it's high priority.
         */
        @NonNull
        public Builder setHighPriority(boolean isHighPriority) {
            mIsHighPriority = isHighPriority;
            return this;
        }
        /**
         * Sets Standard.
         */
        @NonNull
        public Builder setStandard(@Standard int standard) {
            mStandard = standard;
            return this;
        }
        /**
         * Sets whether it's MISO.
         */
        @NonNull
        public Builder setMiso(boolean isMiso) {
            mIsMiso = isMiso;
            return this;
        }
        /**
         * Sets Physical Layer Pipe (PLP) Mode.
         */
        @NonNull
        public Builder setPlpMode(@PlpMode int plpMode) {
            mPlpMode = plpMode;
            return this;
        }
        /**
         * Sets Physical Layer Pipe (PLP) ID.
         */
        @NonNull
        public Builder setPlpId(int plpId) {
            mPlpId = plpId;
            return this;
        }
        /**
         * Sets Physical Layer Pipe (PLP) group ID.
         */
        @NonNull
        public Builder setPlpGroupId(int plpGroupId) {
            mPlpGroupId = plpGroupId;
            return this;
        }

        /**
         * Builds a {@link DvbtFrontendSettings} object.
         */
        @NonNull
        public DvbtFrontendSettings build() {
            return new DvbtFrontendSettings(mFrequency, mTransmissionMode, mBandwidth,
                    mConstellation, mHierarchy, mHpCoderate, mLpCoderate, mGuardInterval,
                    mIsHighPriority, mStandard, mIsMiso, mPlpMode, mPlpId, mPlpGroupId);
        }

        @Override
        Builder self() {
            return this;
        }
    }

    @Override
    public int getType() {
        return FrontendSettings.TYPE_DVBT;
    }
}
