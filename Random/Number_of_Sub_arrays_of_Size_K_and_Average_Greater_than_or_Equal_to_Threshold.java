package Random;
public class Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) 
            sum += arr[i];
        
        if(sum/k >= threshold)
            count++;

        for (int ptr2 = k; ptr2 < arr.length; ptr2++) {
            sum += arr[ptr2] - arr[ptr2-k];

            if ((sum / k) >= threshold) 
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold test1 = new Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold();
        int[] arr = { 2569,9236,4211,9220,7148,9155,5771,1979,9584,2813,8300,1827,1670,4710,2230,1244,436,5171,7901,9149,1829,7061,7981,9835,7706,314,6207,6457,6845,6499,3883,8930,8308,2129,9533,4620,4859,2400,8177,4168,4486,1232,9328,1029,1254,7480,1153,8440,7420,2858,4782,1086,4233,403,9773,6674,5568,4301,4079,5357,4223,7168,2556,7961,5996,6508,2719,5103,5411,7907,7846,3379,9853,2852,9304,5095,2768,3057,1076,1593,3206,561,6321,8605,6542,2085,8400,8944,4485,7624,6919,5220,807,2662,748,1715,5785,8662,320,129,5273,1948,8197,1001,813,5129,5439,9500,5681,1292,4597,6097,8094,3428,4675,974,7827,7111,5044,8524,4627,720,3026,1952,6169,901,7923,8523,3141,5735,8145,8058,1528,737,9785,5534,805,3713,3339,8402,2631,5353,9456,4090,5119,2215,8097,574,3421,519,5820,9437,9813,4490,9127,6802,263,7507,9990,9422,5671,3337,4747,3873,2431,4925,586,6333,6813,7163,8991,7758,3296,5166,7774,1680,5035,6017,704,1754,4802,1871,7930,8849,9525,1728,2628,1849,6377,3645,9657,143,778,9717,2720,5594,8216,5781,1170,7988,8664,4518,2248,2008,4556,4546,5142,6365,9328,9962,9364,536,825,6375,5273,6733,4014,4395,538,178,2412,2613,4936,95,7609,3558,4668,8391,733,6139,8714,303,7071,2289,1636,6793,2570,8560,4129,2326,8075,9908,6960,9356,2250,8464,3607,6709,3196,8351,1879,6850,1276,9913,5027,2108,4625,9644,3749,8193,6686,5078,7214,3720,8891,2938,6454,2158,1147,6055,9706,6107,7530,2647,1804,8337,8251,4811,6158,5831,1969,567,503,5178,2072,4607,597,1861,7179,3520,5248,4637,2553,7892,7809,3387,8586,1812,8414,8638,7185,8178,4119,252,3076,2359,5796,3816,4327,6460,3366,8028,1312,6120,5907,6377,1778,9607,7868,814,389,4080,5290,2940,8757,6893,5416,7357,3917,3770,7748,6822,4563,6983,2192,2078,7390,7237,9907,617,6759,2165,2954,4578,3181,3610,2148,890,2791,7202,8297,6539,6616,9002,7868,5298,1639,7607,2048,3086,1372,7535,4609,4073,5378,7175,5957,5961,2401,4992,7501,1893,9674,4839,3212,7107,1332,5007,7769,441,2449,7088,7635,2215,9863,8336,2579,4969,9337,6578,1590,3859,3075,8999,131,7373,8913,4090,3050,3079,3961,1485,8546,1276,3543,7467,2647,4708,790,2310,3470,7322,8005,4950,5905,4682,2156,6592,6648,1158,6199,4221,8057,8894,630,9147,4301,9238,5445,6245,1166,649,2560,2906,6736,4545,2740,7535,2887,2339,3904,1019,1870,5138,5925,6475,5744,3563,1135,8436,2970,6110,9446,4552,7979,6855,4626,5021,2461,6240,827,6688,1885,5923,3660,6529,5935,6745,1090,5617,8996,1132,2692,9748,2959,8425,1714,6122,1602,9976,6214,7398,8199,7556,7237,1666,2298,5261,4314,7513,6239,3240,5195,7390,9567,4983,5646,4536,1455,6227,2148,817,578,3078,3419,2349,7972,661,3906,9000,8697,8398,6056,5054,3860,7496,5330,3884,2486,8171,7221,596,3723,4295,5365,8126,7306,4507,5486,952,77,6806,2380,5512,1104,3212,3055,7866,9369,7725,4397,7052,609,364,5512,4123,1067,313,7326,7120,2813,1068,2793,9878,9780,7976,2596,179,6811,336,4121,2816,2373,5188,2478,7757,3273,6887,3563,4666,3742,7056,2396,606,8531,1497,2392,1070,3292,5711,9184,187,1411,7412,8997,4823,5084,2940,8904,5761,2969,2292,1319,2104,3560,2541,3512,1749,8236,9270,9881,6864,6149,3076,9580,2192,6356,9204,8591,736,761,8458,2956,4914,1487,7089,437,2708,4210,1155,8262,1818,813,7470,6603,4906,1657,7889,6038,7599,1170,5216,338,2391,6156,6656,3778,4107,7924,350,1026,9503,4211,6604,6080,504,739,1224,2588,9558,2558,1924,8906,9488,7867,2480,5119,8412,6246,6457,1039,5991,9646,881,7763,154,9713,1726,8445,5168,2459,1211,3142,2946,1780,3173,6714,1253,2319,2296,3927,4446,9073,4097,6859,6206,7866,4231,5504,3967,3888,4284,2234,8227,1373,6335,2640,1226,8413,3685,1611,3594,9303,2288,741,8845,7977,8738,4327,3360,6365,8428,2563,4225,7038,3994,1029,8215,7874,8365,2449,7459,2756,5251,9320,5900,6460,8027,9261,5373,1931,7122,7354,1110,9686,262,8592,4515,8158,1845,7268,8184,530,9405,757,4668,9823,2550,3342,8036,7951,8060,9161,8062,3168,9457,2775,3019,9289,8775,4513,5591,1247,4996,8292,4793,6391,9769,2621,5193,9886,9223,4821,1537,6378,7979,6339,4934,601,7091,7774,4453,8497,111,8339,3673,5348,1631,8388,9537,7966,2513,254,9309,471,300,6566,3992,6670,1017,3731,9614,1415,6029,6569,6112,6534,520,9545,7657,6548,7452,7924,5958,6861,4759,975,4836,4585,769,7997,5254,9041,6302,2052,3097,5646,6268,9382,4667,6700,483,2470,6448,9022,2777,2726,7977,9139,4506,463,7354,8398,5917,4121,1594,8708,6239,871,8676,5653,3944,6016,6776,2287,2539,4715,8724,4150,2495,7273,7963,8855,6701,9528,4637,1790,611,8430,8216,3707,856,9803,2837,6844,4768,6020,5981,5030,8967,4468};
        int k = 202;
        int threshold = 10000;

        System.out.println(test1.numOfSubarrays(arr, k, threshold));

    }

}
