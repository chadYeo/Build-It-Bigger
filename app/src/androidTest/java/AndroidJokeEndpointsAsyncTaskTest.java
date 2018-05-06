import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import com.udacity.gradle.builditbigger.JokeEndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class AndroidJokeEndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testVerifyJokeResponseIsNotEmpty() throws Exception {

        JokeEndpointsAsyncTask asyncTaskTest = new JokeEndpointsAsyncTask();
        asyncTaskTest.execute(new Pair<>(InstrumentationRegistry.getTargetContext(), "jokeResult"));
        String joke = asyncTaskTest.get(5, TimeUnit.SECONDS).toString();
        Assert.assertTrue(!joke.equals(""));
    }

    @Test
    public void testVerifyResponse() {
        onView(withId(R.id.tellJoke_button)).perform(click());
        onView(withId(R.id.joke_textView)).check(matches(isDisplayed()));
    }
}
